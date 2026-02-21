from decimal import Decimal


VALID_SIDES = {"BUY", "SELL"}


def validate_symbol(symbol: str) -> str:
    normalized = symbol.strip().upper()
    if not normalized:
        raise ValueError("Symbol cannot be empty.")
    return normalized


def validate_side(side: str) -> str:
    normalized = side.strip().upper()
    if normalized not in VALID_SIDES:
        raise ValueError(f"Side must be one of: {', '.join(sorted(VALID_SIDES))}.")
    return normalized


def validate_positive_decimal(value: Decimal, field_name: str) -> Decimal:
    if value <= 0:
        raise ValueError(f"{field_name} must be > 0.")
    return value

