@Override
	public Statement apply(Statement base, Description description) {
		return new FuzzyStatement(this, base, description);
	}
