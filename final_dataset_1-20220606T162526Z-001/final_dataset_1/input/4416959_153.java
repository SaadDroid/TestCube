public boolean dispatch(Request request, Response response) throws IOException
    {
        ComponentEventRequestParameters parameters = linkEncoder.decodeComponentEventRequest(request);

        if (parameters == null) return false;

        // Inside this pipeline, may find that the component id does not exist (this check only occurs in production
        // mode) ...

        componentRequestHandler.handleComponentEvent(parameters);

        // ... in which case, this attribute is set.
        if (request.getAttribute(InternalConstants.REFERENCED_COMPONENT_NOT_FOUND) != null) {
            return false;
        }

        return true;
    }
