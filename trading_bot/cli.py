import argparse
import json
import os
from decimal import Decimal

from binance.exceptions import BinanceAPIException

from trading_bot.bot.client import create_futures_testnet_client
from trading_bot.bot.logging_config import configure_logging
from trading_bot.bot.orders import calculate_quantity_for_min_notional, place_market_order
from trading_bot.bot.validators import validate_side, validate_symbol


def parse_args() -> argparse.Namespace:
    parser = argparse.ArgumentParser(description="Binance Futures Testnet Trading Bot CLI")
    parser.add_argument("--api-key", default=os.getenv("BINANCE_API_KEY"), required=False)
    parser.add_argument("--api-secret", default=os.getenv("BINANCE_API_SECRET"), required=False)
    parser.add_argument("--symbol", default="BTCUSDT")
    parser.add_argument("--side", default="BUY")
    parser.add_argument("--min-notional", type=Decimal, default=Decimal("100"))
    parser.add_argument("--log-level", default="INFO")
    return parser.parse_args()


def main() -> int:
    args = parse_args()
    configure_logging(args.log_level)

    if not args.api_key or not args.api_secret:
        raise ValueError("Provide --api-key/--api-secret or set BINANCE_API_KEY/BINANCE_API_SECRET.")

    symbol = validate_symbol(args.symbol)
    side = validate_side(args.side)

    client = create_futures_testnet_client(args.api_key, args.api_secret)
    quantity = calculate_quantity_for_min_notional(client, symbol, args.min_notional)

    try:
        order = place_market_order(client, symbol, side, quantity)
        print(json.dumps(order, indent=2))
        return 0
    except BinanceAPIException as e:
        print(f"Binance API error {e.code}: {e.message}")
        return 1


if __name__ == "__main__":
    raise SystemExit(main())
