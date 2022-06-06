public JsonValue create(String location, String resourceId, JsonValue payload, Context context)
            throws ResourceException {

        Reject.ifTrue(StringUtils.isEmpty(location), "The endpoint destination may not be null or empty.");
        Reject.ifNull(payload, "The payload object to create must not be null.");

        final Router rootRouter = router.get();
        final CreateRequest createRequest = Requests.newCreateRequest(location, payload);

        if (resourceId != null) {
            createRequest.setNewResourceId(resourceId);
        }

        return rootRouter.handleCreate(context, createRequest).getOrThrowUninterruptibly().getContent();
    }
