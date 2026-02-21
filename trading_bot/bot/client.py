import time
from binance.client import Client


def create_futures_testnet_client(api_key: str, api_secret: str) -> Client:
    client = Client(api_key, api_secret)
    client.FUTURES_URL = "https://testnet.binancefuture.com/fapi"
    client.API_URL = "https://testnet.binancefuture.com"
    sync_timestamp(client)
    return client


def sync_timestamp(client: Client) -> None:
    server_time = client.futures_time()["serverTime"]
    client.timestamp_offset = server_time - int(time.time() * 1000)

