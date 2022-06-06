@Override
    public AccessResource parse(RemotingCommand request, String remoteAddr) {
        PlainAccessResource accessResource = new PlainAccessResource();
        if (remoteAddr != null && remoteAddr.contains(":")) {
            accessResource.setWhiteRemoteAddress(remoteAddr.split(":")[0]);
        } else {
            accessResource.setWhiteRemoteAddress(remoteAddr);
        }

        accessResource.setRequestCode(request.getCode());

        if (request.getExtFields() == null) {
            //If request's extFields is null,then return accessResource directly(users can use whiteAddress pattern)
            //The following logic codes depend on the request's extFields not to be null.
            return accessResource;
        }
        accessResource.setAccessKey(request.getExtFields().get(SessionCredentials.ACCESS_KEY));
        accessResource.setSignature(request.getExtFields().get(SessionCredentials.SIGNATURE));
        accessResource.setSecretToken(request.getExtFields().get(SessionCredentials.SECURITY_TOKEN));

        try {
            switch (request.getCode()) {
                case RequestCode.SEND_MESSAGE:
                    accessResource.addResourceAndPerm(request.getExtFields().get("topic"), Permission.PUB);
                    break;
                case RequestCode.SEND_MESSAGE_V2:
                    accessResource.addResourceAndPerm(request.getExtFields().get("b"), Permission.PUB);
                    break;
                case RequestCode.CONSUMER_SEND_MSG_BACK:
                    accessResource.addResourceAndPerm(request.getExtFields().get("originTopic"), Permission.PUB);
                    accessResource.addResourceAndPerm(getRetryTopic(request.getExtFields().get("group")), Permission.SUB);
                    break;
                case RequestCode.PULL_MESSAGE:
                    accessResource.addResourceAndPerm(request.getExtFields().get("topic"), Permission.SUB);
                    accessResource.addResourceAndPerm(getRetryTopic(request.getExtFields().get("consumerGroup")), Permission.SUB);
                    break;
                case RequestCode.QUERY_MESSAGE:
                    accessResource.addResourceAndPerm(request.getExtFields().get("topic"), Permission.SUB);
                    break;
                case RequestCode.HEART_BEAT:
                    HeartbeatData heartbeatData = HeartbeatData.decode(request.getBody(), HeartbeatData.class);
                    for (ConsumerData data : heartbeatData.getConsumerDataSet()) {
                        accessResource.addResourceAndPerm(getRetryTopic(data.getGroupName()), Permission.SUB);
                        for (SubscriptionData subscriptionData : data.getSubscriptionDataSet()) {
                            accessResource.addResourceAndPerm(subscriptionData.getTopic(), Permission.SUB);
                        }
                    }
                    break;
                case RequestCode.UNREGISTER_CLIENT:
                    final UnregisterClientRequestHeader unregisterClientRequestHeader =
                        (UnregisterClientRequestHeader) request
                            .decodeCommandCustomHeader(UnregisterClientRequestHeader.class);
                    accessResource.addResourceAndPerm(getRetryTopic(unregisterClientRequestHeader.getConsumerGroup()), Permission.SUB);
                    break;
                case RequestCode.GET_CONSUMER_LIST_BY_GROUP:
                    final GetConsumerListByGroupRequestHeader getConsumerListByGroupRequestHeader =
                        (GetConsumerListByGroupRequestHeader) request
                            .decodeCommandCustomHeader(GetConsumerListByGroupRequestHeader.class);
                    accessResource.addResourceAndPerm(getRetryTopic(getConsumerListByGroupRequestHeader.getConsumerGroup()), Permission.SUB);
                    break;
                case RequestCode.UPDATE_CONSUMER_OFFSET:
                    final UpdateConsumerOffsetRequestHeader updateConsumerOffsetRequestHeader =
                        (UpdateConsumerOffsetRequestHeader) request
                            .decodeCommandCustomHeader(UpdateConsumerOffsetRequestHeader.class);
                    accessResource.addResourceAndPerm(getRetryTopic(updateConsumerOffsetRequestHeader.getConsumerGroup()), Permission.SUB);
                    accessResource.addResourceAndPerm(updateConsumerOffsetRequestHeader.getTopic(), Permission.SUB);
                    break;
                default:
                    break;

            }
        } catch (Throwable t) {
            throw new AclException(t.getMessage(), t);
        }

        // Content
        SortedMap<String, String> map = new TreeMap<String, String>();
        for (Map.Entry<String, String> entry : request.getExtFields().entrySet()) {
            if (!SessionCredentials.SIGNATURE.equals(entry.getKey())) {
                map.put(entry.getKey(), entry.getValue());
            }
        }
        accessResource.setContent(AclUtils.combineRequestContent(request, map));
        return accessResource;
    }
