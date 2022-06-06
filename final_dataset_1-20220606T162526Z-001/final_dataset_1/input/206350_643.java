public static Expression notBetweenDbExp(String pathSpec, Object value1, Object value2) {
		return new ASTNotBetween(new ASTDbPath(pathSpec), value1, value2);
	}
