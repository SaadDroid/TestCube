public boolean setupValidation(XMLStreamReader reader, Endpoint endpoint, ServiceInfo serviceInfo)
            throws XMLStreamException {

        // Gosh, this is bad, but I don't know a better solution, unless we're willing
        // to require the stax2 API no matter what.
        XMLStreamReader effectiveReader = reader;
        if (effectiveReader instanceof DepthXMLStreamReader) {
            effectiveReader = ((DepthXMLStreamReader) reader).getReader();
        }
        final XMLStreamReader2 reader2 = (XMLStreamReader2) effectiveReader;
        XMLValidationSchema vs = getValidator(endpoint, serviceInfo);
        if (vs == null) {
            return false;
        }
        reader2.setValidationProblemHandler(new ValidationProblemHandler() {

            public void reportProblem(XMLValidationProblem problem) throws XMLValidationException {
                throw new Fault(new Message("READ_VALIDATION_ERROR", LOG, problem.getMessage()),
                        Fault.FAULT_CODE_CLIENT);
            }
        });
        reader2.validateAgainst(vs);
        return true;
    }
