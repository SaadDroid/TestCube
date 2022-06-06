@Override
	public int compare(Object o1, Object o2) {
		Expression exp = getSortSpec();
		Object value1 = null;
		Object value2 = null;
		try {
			value1 = exp.evaluate(o1);
		} catch (ExpressionException e) {
			if (pathExceptionSuppressed && e.getCause() instanceof org.apache.cayenne.reflect.UnresolvablePathException) {
				// do nothing, we expect this
			} else {
				// re-throw
				throw e;
			}
		}

		try {
			value2 = exp.evaluate(o2);
		} catch (ExpressionException e) {
			if (pathExceptionSuppressed && e.getCause() instanceof org.apache.cayenne.reflect.UnresolvablePathException) {
				// do nothing, we expect this
			} else {
				// rethrow
				throw e;
			}
		}

		if (value1 == null && value2 == null) {
			return 0;
		} else if (value1 == null) {
			return nullSortedFirst ? -1 : 1;
		} else if (value2 == null) {
			return nullSortedFirst ? 1 : -1;
		}

		if (isCaseInsensitive()) {
			// TODO: to upper case should probably be defined as a separate
			// expression
			// type
			value1 = ConversionUtil.toUpperCase(value1);
			value2 = ConversionUtil.toUpperCase(value2);
		}

		int compareResult = ConversionUtil.toComparable(value1).compareTo(ConversionUtil.toComparable(value2));
		return (isAscending()) ? compareResult : -compareResult;
	}
