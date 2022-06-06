public static <E> List<E> orderedList(final Collection<E> objects, List<? extends Ordering> orderings) {
		List<E> newList = new ArrayList<>(objects);
		
		orderList(newList, orderings);
		
		return newList;
	}
