protected CloseableHttpResponse sendRequest(CloseableHttpClient client) throws IOException {
        RequestBuilder builder = createRequestBuilder();

        // replace placeholder
        Map<String, Property> paramsMap = ParamUtils.convert(ParamUtils.getUserDefParamsMap(taskExecutionContext.getDefinedParams()),
                taskExecutionContext.getDefinedParams(),
                httpParameters.getLocalParametersMap(),
                CommandType.of(taskExecutionContext.getCmdTypeIfComplement()),
                taskExecutionContext.getScheduleTime());
        List<HttpProperty> httpPropertyList = new ArrayList<>();
        if(CollectionUtils.isNotEmpty(httpParameters.getHttpParams() )){
            for (HttpProperty httpProperty: httpParameters.getHttpParams()) {
                String jsonObject = JSONUtils.toJsonString(httpProperty);
                String params = ParameterUtils.convertParameterPlaceholders(jsonObject,ParamUtils.convert(paramsMap));
                logger.info("http request params：{}",params);
                httpPropertyList.add(JSONUtils.parseObject(params,HttpProperty.class));
            }
        }
        addRequestParams(builder,httpPropertyList);
        String requestUrl = ParameterUtils.convertParameterPlaceholders(httpParameters.getUrl(),ParamUtils.convert(paramsMap));
        HttpUriRequest request = builder.setUri(requestUrl).build();
        setHeaders(request,httpPropertyList);
        return client.execute(request);
    }
