@Override
	public boolean isParameterUsed() {
		throw new IllegalStateException(
				"A NopWhereClauseParte does not support a whereClause");
	}
