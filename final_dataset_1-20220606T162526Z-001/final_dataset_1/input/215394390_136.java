public final void handleRequest(InputStream inputStream, OutputStream outputStream, final Context context)
            throws IOException
    {
        try (BlockAllocatorImpl allocator = new BlockAllocatorImpl()) {
            ObjectMapper objectMapper = VersionedObjectMapperFactory.create(allocator);
            try (FederationRequest rawReq = objectMapper.readValue(inputStream, FederationRequest.class)) {
                handleRequest(allocator, rawReq, outputStream, objectMapper);
            }
        }
        catch (Exception ex) {
            logger.warn("handleRequest: Completed with an exception.", ex);
            throw (ex instanceof RuntimeException) ? (RuntimeException) ex : new RuntimeException(ex);
        }
    }
