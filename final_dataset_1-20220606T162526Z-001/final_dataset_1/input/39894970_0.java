@Override
	public OutputInteraction createOutputInteraction()
			throws ConnectorException {

		return new SplunkLogOutputInteraction();
	}
