@Override
	public List<Subscription> getAllSubscriptions(int limit) {
		List<Subscription> result = new ArrayList<Subscription>();
		result.addAll(subscriptionId2Subscription.values());
		if (limit > 0) {
			if (limit < result.size()) {
				result = result.subList(0, limit);
			}
		}
		return result;
	}
