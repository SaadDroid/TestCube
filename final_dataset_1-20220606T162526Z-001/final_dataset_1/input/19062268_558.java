@Override
	public String toString() {
		return
			MoreObjects.
				toStringHelper(getClass()).
					omitNullValues().
						add("enqueued",super.isEnqueued()).
						add("state",this.state).
						toString();
	}
