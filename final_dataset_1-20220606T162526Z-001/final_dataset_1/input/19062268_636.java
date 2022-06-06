@Override
	public <T> List<T> rawValuesAs(Class<? extends T> clazz) {
		Builder<T> builder = ImmutableList.<T>builder();
		for(String rawValue:this.rawValues) {
			builder.add(ObjectUtil.fromString(clazz,rawValue));
		}
		return builder.build();
	}
