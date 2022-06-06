public HttpResult httpGet(String url) throws HttpException {
        return execute(new HttpRequest2Builder(HttpMethod.GET, url).create());
    }
