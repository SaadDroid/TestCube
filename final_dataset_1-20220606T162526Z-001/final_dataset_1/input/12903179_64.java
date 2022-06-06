public static ObservableBooleanValue matches(ObservableValue<String> source, Pattern pattern) {
		return Bindings.createBooleanBinding(() -> {
			final String s = source.getValue();
			return s != null && pattern.matcher(s).matches();
		}, source);
	}
