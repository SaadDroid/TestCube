public static GetNamespaceRequest createGetNamespaceRequest(String colName) {
        return GetNamespaceRequest.newBuilder()
            .setName(colName)
            .build();
    }
