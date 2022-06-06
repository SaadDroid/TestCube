public <T extends Object> void collectiveVerifyZeroInteractions(Collection<T>... mocks) {
		collectiveVerifyNoMoreInteractions(mocks);
	}
