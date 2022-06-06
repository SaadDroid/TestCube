public static Expression lessOrEqualExp(String pathSpec, Object value) {
		return lessOrEqualExp(new ASTObjPath(pathSpec), value);
	}
