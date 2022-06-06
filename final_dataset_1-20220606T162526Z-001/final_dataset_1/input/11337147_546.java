@Override
    public CaseDocumentItem get(final APIID id) {
        try {
            final Document documentItem = processAPI.getDocument(id.toLong());
            return convertEngineToConsoleItem(documentItem);
        } catch (final Exception e) {
            throw new APIException(e);
        }
    }
