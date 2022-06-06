@Nullable
	@Override
	public RpcSender createSender(RpcClientConnectionPool pool) {
		List<RpcSender> senders = list.listOfSenders(pool);
		if (senders.size() == 0)
			return null;
		return new Sender(senders, resultValidator, noValidResultException);
	}
