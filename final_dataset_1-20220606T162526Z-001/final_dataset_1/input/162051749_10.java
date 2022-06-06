@Deprecated
    public HttpResult execute(HttpRequest request) throws HttpException {
        Validate.notNull(request, "request must not be null");

        HttpUriRequest httpRequest;
        String url;
        switch (request.getMethod()) {
            case GET:
                url = createUrl(request);
                httpRequest = new HttpGet(url);
                break;
            case POST:
                url = request.getUrl();
                HttpPost httpPost = new HttpPost(url);
                HttpEntity entity;

                if (request.getHttpEntity() != null) {
                    entity = request.getHttpEntity();
                } else {
                    List<NameValuePair> postParams = new ArrayList<>();
                    for (Entry<String, String> param : request.getParameters().entrySet()) {
                        postParams.add(new BasicNameValuePair(param.getKey(), param.getValue()));
                    }
                    entity = new UrlEncodedFormEntity(postParams, request.getCharset());
                }

                httpPost.setEntity(entity);
                httpRequest = httpPost;
                break;
            case HEAD:
                url = createUrl(request);
                httpRequest = new HttpHead(url);
                break;
            case DELETE:
                url = createUrl(request);
                httpRequest = new HttpDelete(url);
                break;
            case PUT:
                url = request.getUrl();
                HttpPut httpPut = new HttpPut(url);

                if (request.getHttpEntity() != null) {
                    entity = request.getHttpEntity();
                } else {
                    List<NameValuePair> postParams = new ArrayList<>();
                    for (Entry<String, String> param : request.getParameters().entrySet()) {
                        postParams.add(new BasicNameValuePair(param.getKey(), param.getValue()));
                    }
                    entity = new UrlEncodedFormEntity(postParams, request.getCharset());
                }

                httpPut.setEntity(entity);
                httpRequest = httpPut;
                break;
            default:
                throw new IllegalArgumentException("Unimplemented method: " + request.getMethod());
        }

        for (Entry<String, String> header : request.getHeaders().entrySet()) {
            httpRequest.setHeader(header.getKey(), header.getValue());
        }

        return execute(url, httpRequest);
    }
