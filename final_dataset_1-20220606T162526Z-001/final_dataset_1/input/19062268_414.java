@Override
	public void visitLiteral(Literal<?> literal) {
		adaptValue(literal.get());
	}
