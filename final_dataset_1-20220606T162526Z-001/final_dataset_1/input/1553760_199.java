@Override
	public void flush() {
		assertCloseImplicitBlock();
		delegate.flush();
	}
