public static Expression expressionOfType(int type) {
		if (type < 0 || type >= typeLookup.length) {
			throw new ExpressionException("Bad expression type: " + type);
		}

		if (typeLookup[type] == null) {
			throw new ExpressionException("Bad expression type: " + type);
		}

		// expected this
		try {
			return typeLookup[type].newInstance();
		} catch (Exception ex) {
			throw new ExpressionException("Error creating expression", ex);
		}
	}
