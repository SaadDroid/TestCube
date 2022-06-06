public InternalSession fromToken(Token token) {
        String jsonBlob = blobUtils.getBlobAsString(token);
        int index = findIndexOfValidField(jsonBlob);

        // Do we need to insert the LatestAccessTime Into the Blob?
        String latestAccessTime = token.getValue(SessionTokenField.LATEST_ACCESS_TIME.getField());
        if (latestAccessTime != null && index != -1) {
            // Assemble the Sting to insert
            // latestAccessTime
            String fieldName = SessionTokenField.LATEST_ACCESS_TIME.getInternalSessionFieldName();
            // "latestAccessTime":
            String jsonField = JSONSerialisation.jsonAttributeName(fieldName);
            // "latestAccessTime":12345,
            String addition = jsonField + latestAccessTime + ",";

            // Insert the string into the JSON Blob
            jsonBlob = jsonBlob.substring(0, index) + addition + jsonBlob.substring(index, jsonBlob.length());
        }

        InternalSession session = serialisation.deserialise(jsonBlob, InternalSession.class);
        if (session.getSessionHandle() == null) {
            //Originally the sessionHandle was stored in the serialize token, so if after the deserialization the
            //sessionHandle field is not set, then we should attempt to retrieve the value directly from the token.
            session.setSessionHandle(token.<String>getValue(SessionTokenField.SESSION_HANDLE.getField()));
        }

        return session;
    }
