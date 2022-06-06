public static Expression joinExp(int type, Collection<Expression> expressions) {
		int len = expressions.size();
		if (len == 0) {
			return null;
		}

		return joinExp(type, expressions.toArray(new Expression[len]));
	}
