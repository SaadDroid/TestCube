public static Expression lessExp(String pathSpec, Object value) {
		return lessExp(new ASTObjPath(pathSpec), value);
	}
