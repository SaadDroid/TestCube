@Nullable
	@Override
	public RpcSender createSender(RpcClientConnectionPool pool) {
		List<RpcSender> subSenders = list.listOfSenders(pool);
		if (subSenders.size() < minActiveSubStrategies)
			return null;
		if (subSenders.size() == 0)
			return null;
		if (subSenders.size() == 1)
			return subSenders.get(0);
		return new Sender(subSenders);
	}
