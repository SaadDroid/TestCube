public DataSet createDataSet(final Message response, final MessageType messageType) {
        try {
            if (response.getPayload() instanceof DataSet) {
                return response.getPayload(DataSet.class);
            } else if (isReadyToMarshal(response, messageType)) {
                return marshalResponse(response, messageType);
            } else {
                return new DataSet();
            }
        } catch (final SQLException e) {
            throw new CitrusRuntimeException("Failed to read dataSet from response message", e);
        }
    }
