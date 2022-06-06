@Override
    public CaseDocumentItem update(final APIID id, final Map<String, String> attributes) {
        DocumentValue documentValue = null;

        try {
            final String urlPath;

            if (attributes.containsKey(CaseDocumentItem.ATTRIBUTE_UPLOAD_PATH) || attributes.containsKey(CaseDocumentItem.ATTRIBUTE_URL)) {

                if (attributes.containsKey(CaseDocumentItem.ATTRIBUTE_URL)) {
                    urlPath = attributes.get(CaseDocumentItem.ATTRIBUTE_URL);
                    documentValue = buildDocumentValueFromUrl(urlPath, -1);
                } else {
                    urlPath = attributes.get(CaseDocumentItem.ATTRIBUTE_UPLOAD_PATH);
                    documentValue = buildDocumentValueFromUploadPath(urlPath, -1, attributes.get(CaseDocumentItem.ATTRIBUTE_CONTENT_FILENAME));
                }

                final Document document = processAPI.updateDocument(id.toLong(), documentValue);
                return convertEngineToConsoleItem(document);

            } else {
                throw new APIException("Error while attaching a new document. Request with bad param value.");
            }
        } catch (final UnauthorizedFolderException e) {
            throw new APIForbiddenException(e.getMessage());
        } catch (final Exception e) {
            throw new APIException(e);
        }
    }
