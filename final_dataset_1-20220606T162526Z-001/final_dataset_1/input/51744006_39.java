public ListenableFuture<String[]> bulkRegister(BulkRegisterRequest bulkRegisterRequest) {
        return adapt(request(HttpMethod.POST, UriComponentsBuilder.fromHttpUrl(baseURL).path("v2/op/register").toUriString(), bulkRegisterRequest, String[].class));
    }
