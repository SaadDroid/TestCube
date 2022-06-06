@Override
	public byte[] pack(Map<String, String> fields) throws ISOException {

		String value = fields.get(switchField);

		if (value == null) {
			if (defaultCase != null) {
				defaultCase.setValue(fields.get(defaultCase.getName()));
				return defaultCase.pack(fields);
			}
			return null;
		}
		AFSDFieldPackager selectedPackager = switchCases.get(value);
		if (selectedPackager == null) {

			if (defaultCase != null) {
				defaultCase.setValue(fields.get(defaultCase.getName()));
				return defaultCase.pack(fields);
			}
			return null;

		}
		selectedPackager.setValue(fields.get(selectedPackager.getName()));
		return selectedPackager.pack(fields);

	}
