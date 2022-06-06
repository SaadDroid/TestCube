public JsonValue read(String location, String resourceId, Context context)
            throws ResourceException {

        Reject.ifTrue(StringUtils.isEmpty(location), "The endpoint destination may not be null or empty.");
        Reject.ifTrue(StringUtils.isEmpty(resourceId), "The resourceId to read may not be null or empty.");

        final Router rootRouter = router.get();
        final ReadRequest readRequest = Requests.newReadRequest(location, resourceId);
        return rootRouter.handleRead(context, readRequest).getOrThrowUninterruptibly().getContent();
    }
