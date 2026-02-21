import json
import os
from decimal import Decimal

from binance.exceptions import BinanceAPIException

from trading_bot.bot.client import create_futures_testnet_client
from trading_bot.bot.orders import calculate_quantity_for_min_notional, place_market_order


def main() -> int:
    api_key = os.getenv("BINANCE_API_KEY")
    api_secret = os.getenv("BINANCE_API_SECRET")

    if not api_key or not api_secret:
        print("Set BINANCE_API_KEY and BINANCE_API_SECRET environment variables.")
        return 1

    client = create_futures_testnet_client(api_key, api_secret)
    symbol = "BTCUSDT"
    side = "BUY"
    quantity = calculate_quantity_for_min_notional(client, symbol, Decimal("100"))

    try:
        order = place_market_order(client, symbol, side, quantity)
        print(json.dumps(order, indent=2))
        return 0
    except BinanceAPIException as e:
        print(f"Binance API error {e.code}: {e.message}")
        return 1


if __name__ == "__main__":
    raise SystemExit(main())
