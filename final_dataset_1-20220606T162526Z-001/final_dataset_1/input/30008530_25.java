@Override
	public synchronized Set<Integer> getToTakePartitions(String topic) {
		Set<Integer> myPartitions = getMyPartitions(topic);
		Set<Integer> copy = new HashSet<Integer>(m_allocated);
		copy.removeAll(myPartitions);
		return copy;
	}
