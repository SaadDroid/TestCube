int startsAt() {
		checkState(this.partStart<this.partEnd,ERROR_ITERATION_HAS_NOT_STARTED);
		return this.partStart;
	}
