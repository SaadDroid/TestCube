@Override
    public void validateCreatePayload(Request request) throws InvalidPayloadException {
        super.validateCreatePayload(request);

        String name = request.getProperty("name");
        // name will be in the fully qualified form: taxonomyName.termName
        if (! name.contains(".")) {
            throw new InvalidPayloadException("Term name must be in the form 'taxonomyName.termName.subTermName'");
        }

        if (! request.getQueryProperties().containsKey("available_as_tag")) {
            request.getQueryProperties().put("available_as_tag", true);
        }
    }
