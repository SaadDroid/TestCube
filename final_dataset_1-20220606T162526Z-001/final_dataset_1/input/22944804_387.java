@Override
    public Promise<ResourceResponse, ResourceException> createInstance(Context context, CreateRequest request) {
        try {
             final ScriptConfiguration sc = serviceFactory
                    .create(getContextSubject(context), getRealm(context))
                    .create(fromJson(request.getContent()));
            return newResultPromise(newResourceResponse(sc.getId(), String.valueOf(sc.hashCode()), asJson(sc)));
        } catch (ScriptException se) {
            return exceptionMappingHandler.handleError(context, request, se).asPromise();
        }
    }
