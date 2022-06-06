@Override
    public Response execute(Client client, Request request) throws IdobataError {
        List<Header> requestHeaders = new ArrayList<Header>(request.getHeaders());
        requestHeaders.add(new Header("X-API-Token", mTokenProvider.get()));
        try {
            Response response = client.execute(new Request(request.getMethod(), request.getUrl(), requestHeaders, request.getBody()));
            int status = response.getStatus();
            if (status >= 400) {
                throw new HttpError(request.getUrl(), status, response.getReason());
            }
            return response;
        } catch (IOException e) {
            throw new IdobataError(e);
        }
    }
