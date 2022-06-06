public static Expression notLikeIgnoreCaseExp(String pathSpec, Object value) {
		return notLikeIgnoreCaseExp(new ASTObjPath(pathSpec), value);
	}
