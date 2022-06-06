@Override
    public boolean cleanUnusedTopic(String cluster) throws RemotingConnectException, RemotingSendRequestException,
        RemotingTimeoutException, MQClientException, InterruptedException {
        return defaultMQAdminExtImpl.cleanUnusedTopicByAddr(cluster);
    }
