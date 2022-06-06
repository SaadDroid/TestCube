@Nullable
	@Override
	public RpcSender createSender(RpcClientConnectionPool pool) {
		List<RpcSender> senders = list.listOfSenders(pool);
		if (senders.isEmpty())
			return null;
		return senders.get(0);
	}
