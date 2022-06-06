@Override
	public synchronized Set<Integer> getToReleasePartitions(String topic,
			int count) {
		Set<Integer> myPartitions = getMyPartitions(topic);
		Set<Integer> copy = new HashSet<Integer>(myPartitions);
		copy.removeAll(m_allocated);
		return copy;
	}
