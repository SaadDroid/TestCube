@Override
	public Outcome handleRequest(Exchange exc) throws Exception {

		ExtractedData data = analyse(exc.getRequest());

		if (!data.hasAnyData()) {
			return Outcome.CONTINUE;
		}

		exc.setProperty(REQUEST_ROOT_ELEMENT_NAME, data.rootElementName);
		exc.setProperty(REQUEST_ROOT_ELEMENT_NS, data.rootElementNS);

		if (!data.hasSoapData()) {
			return Outcome.CONTINUE;
		}

		exc.setProperty(REQUEST_SOAP_OPERATION, data.bodyContentElementName);
		exc.setProperty(REQUEST_SOAP_OPERATION_NS, data.bodyContentElementNS);
		exc.setProperty(REQUEST_SOAP_VERSION, data.getSoapVersion());

		return Outcome.CONTINUE;
	}
