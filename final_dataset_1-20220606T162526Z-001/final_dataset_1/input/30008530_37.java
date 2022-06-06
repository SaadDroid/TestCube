@Override
	public synchronized Set<Integer> getToTakePartitions(String topic) {
		return getIdlePartitions(topic);
	}
