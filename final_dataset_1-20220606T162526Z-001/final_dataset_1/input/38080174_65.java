@Override
	public List<D> squash(List<? extends D> ops) {
		if (ops.isEmpty()) {
			return emptyList();
		}
		List<D1> squashed1 = otSystem1.squash(collect(ops, getter1));
		List<D2> squashed2 = otSystem2.squash(collect(ops, getter2));

		return combineLists2(squashed1, squashed2, constructor);
	}
