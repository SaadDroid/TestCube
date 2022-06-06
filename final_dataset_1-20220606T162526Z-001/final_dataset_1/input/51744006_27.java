public ListenableFuture<Void> deleteRegistration(String registrationId) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(baseURL);
        builder.path("v2/registrations/{registrationId}");
        return adapt(request(HttpMethod.DELETE, builder.buildAndExpand(registrationId).toUriString(), null, Void.class));
    }
