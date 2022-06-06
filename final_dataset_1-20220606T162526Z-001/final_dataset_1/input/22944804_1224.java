@Override
    public Promise<ResourceResponse, ResourceException> filterUpdate(Context context, UpdateRequest request,
            RequestHandler next) {
        try {
            final JsonValue jsonValue = request.getContent();
            final Subject callingSubject = contextHelper.getSubject(context);
            final String realm = contextHelper.getRealm(context);

            retrieveResourceType(jsonValue, callingSubject, realm);

        } catch (EntitlementException eE) {
            debug.error("Error filtering policy create CREST request", eE);
            return resourceErrorHandler.handleError(context, request, eE).asPromise();
        } catch (ResourceException rE) {
            debug.error("Error filtering policy create CREST request", rE);
            return rE.asPromise();
        }

        return transform(next.handleUpdate(context, request));
    }
