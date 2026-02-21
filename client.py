import time
from binance.client import Client
from binance.exceptions import BinanceAPIException


class BinanceFuturesClient:
    def __init__(self, api_key: str, api_secret: str):
        self.client = Client(api_key, api_secret)
        self.client.FUTURES_URL = "https://testnet.binancefuture.com/fapi"

        # Sync timestamp to avoid -1021 error
        server_time = self.client.futures_time()
        self.client.timestamp_offset = server_time["serverTime"] - int(time.time() * 1000)

    def create_order(self, **params):
        try:
            response = self.client.futures_create_order(**params)
            return response
        except BinanceAPIException as e:
            raise Exception(f"Binance API Error: {e.message}")
        except Exception as e:
            raise Exception(f"Unexpected Error: {str(e)}")