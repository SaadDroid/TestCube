@Override
    public ListSchemasResponse doListSchemaNames(final BlockAllocator blockAllocator, final ListSchemasRequest listSchemasRequest)
    {
        try (Connection connection = jdbcConnectionFactory.getConnection(getCredentialProvider())) {
            LOGGER.info("{}: List schema names for Catalog {}", listSchemasRequest.getQueryId(), listSchemasRequest.getCatalogName());
            return new ListSchemasResponse(listSchemasRequest.getCatalogName(), listDatabaseNames(connection));
        }
        catch (SQLException sqlException) {
            throw new RuntimeException(sqlException.getErrorCode() + ": " + sqlException.getMessage());
        }
    }
