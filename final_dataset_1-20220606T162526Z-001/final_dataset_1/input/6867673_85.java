@Override
    protected List<String> retrieveValue(final Request req) {
        return req.getParameters().getValues(this.paramName);
    }
