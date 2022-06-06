@Override
	public Outcome handleResponse(Exchange exc) throws Exception {

		ExtractedData data = analyse(exc.getResponse());

		if (!data.hasAnyData()) {
			return Outcome.CONTINUE;
		}

		exc.setProperty(RESPONSE_ROOT_ELEMENT_NAME, data.rootElementName);
		exc.setProperty(RESPONSE_ROOT_ELEMENT_NS, data.rootElementNS);

		if (!data.hasSoapData()) {
			return Outcome.CONTINUE;
		}

		exc.setProperty(RESPONSE_SOAP_OPERATION, data.bodyContentElementName.replace("Response", ""));
		exc.setProperty(RESPONSE_SOAP_OPERATION_NS, data.bodyContentElementNS);
		exc.setProperty(RESPONSE_SOAP_VERSION, data.getSoapVersion());

		return Outcome.CONTINUE;
	}
