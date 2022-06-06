@Override
    public final void handleRequest(InputStream inputStream, OutputStream outputStream, Context context)
    {
        try (BlockAllocator allocator = new BlockAllocatorImpl()) {
            ObjectMapper objectMapper = VersionedObjectMapperFactory.create(allocator);
            try (FederationRequest rawRequest = objectMapper.readValue(inputStream, FederationRequest.class)) {
                if (rawRequest instanceof PingRequest) {
                    try (PingResponse response = doPing((PingRequest) rawRequest)) {
                        assertNotNull(response);
                        objectMapper.writeValue(outputStream, response);
                    }
                    return;
                }

                if (!(rawRequest instanceof UserDefinedFunctionRequest)) {
                    throw new RuntimeException("Expected a UserDefinedFunctionRequest but found "
                            + rawRequest.getClass());
                }

                doHandleRequest(allocator, objectMapper, (UserDefinedFunctionRequest) rawRequest, outputStream);
            }
            catch (Exception ex) {
                throw (ex instanceof RuntimeException) ? (RuntimeException) ex : new RuntimeException(ex);
            }
        }
    }
