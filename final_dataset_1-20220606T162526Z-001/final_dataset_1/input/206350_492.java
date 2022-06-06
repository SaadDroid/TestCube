@SuppressWarnings("unchecked")
	public static void orderList(List<?> objects, List<? extends Ordering> orderings) {
		if(objects == null || orderings == null || orderings.isEmpty()) {
			return;
		}
		Comparator<Object> comparator = orderings.get(0);
		for(int i=1; i<orderings.size(); i++) {
			comparator = comparator.thenComparing(orderings.get(i));
		}
		objects.sort(comparator);
	}
