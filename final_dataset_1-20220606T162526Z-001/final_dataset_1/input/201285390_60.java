@Override
    public SubscriptionGroupWrapper getAllSubscriptionGroup(final String brokerAddr,
        long timeoutMillis) throws InterruptedException, RemotingTimeoutException, RemotingSendRequestException,
        RemotingConnectException, MQBrokerException {
        return this.defaultMQAdminExtImpl.getAllSubscriptionGroup(brokerAddr, timeoutMillis);
    }
