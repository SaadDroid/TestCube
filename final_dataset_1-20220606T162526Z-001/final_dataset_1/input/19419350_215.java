public SendResult sendCoins(TransactionBroadcaster broadcaster, Address to, Coin value) throws InsufficientMoneyException {
        SendRequest request = SendRequest.to(to, value);
        return sendCoins(broadcaster, request);
    }
