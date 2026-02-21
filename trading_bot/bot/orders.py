from decimal import Decimal, ROUND_UP
from typing import Any, Dict

from binance.client import Client

from .validators import validate_positive_decimal


def get_step_size(client: Client, symbol: str) -> Decimal:
    exchange_info = client.futures_exchange_info()
    symbol_info = next(s for s in exchange_info["symbols"] if s["symbol"] == symbol)
    lot_size_filter = next(f for f in symbol_info["filters"] if f["filterType"] == "LOT_SIZE")
    return Decimal(lot_size_filter["stepSize"])


def calculate_quantity_for_min_notional(
    client: Client, symbol: str, min_notional_usdt: Decimal, buffer_pct: Decimal = Decimal("1.01")
) -> Decimal:
    validate_positive_decimal(min_notional_usdt, "min_notional_usdt")
    validate_positive_decimal(buffer_pct, "buffer_pct")

    mark_price = Decimal(client.futures_mark_price(symbol=symbol)["markPrice"])
    step_size = get_step_size(client, symbol)

    raw_qty = (min_notional_usdt / mark_price) * buffer_pct
    return raw_qty.quantize(step_size, rounding=ROUND_UP)


def place_market_order(
    client: Client, symbol: str, side: str, quantity: Decimal, recv_window: int = 60000
) -> Dict[str, Any]:
    return client.futures_create_order(
        symbol=symbol,
        side=side,
        type="MARKET",
        quantity=float(quantity),
        recvWindow=recv_window,
    )

