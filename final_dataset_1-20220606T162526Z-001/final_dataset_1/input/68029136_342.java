public List<T> getContextsByLowestContext(ContextEntity context) {
		List<T> result = new ArrayList<T>();
		if (getContexts() != null && context != null) {
			addToContextList(result, context);
		}
		return result;
	}
