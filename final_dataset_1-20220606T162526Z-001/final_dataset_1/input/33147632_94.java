Request resign(Request request, GuestAuthToken token) {
        final Request.Builder builder = request.newBuilder();
        GuestAuthInterceptor.addAuthHeaders(builder, token);
        return builder.build();
    }
