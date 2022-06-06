@Override
	public void visitLiteral(Literal<?> value) {
		value.accept(this.adapter);
		this.value=this.adapter.adaptedValue();
	}
