public void update(String videoId, String language, Caption caption, ResponseListener<Caption> captionResponseListener, ResponseErrorListener responseErrorListener) throws JSONException {
        RequestBuilder requestBuilder = new RequestBuilder()
                .jsonRequest(captionJsonSerializer.serialize(caption), response -> {
                    if (!response.toString().isEmpty()) {
                        try {
                            captionResponseListener.onResponse(captionJsonSerializer.deserialize(response));
                        } catch (JSONException e) {
                            responseErrorListener.onErrorResponse(new ServerException("could not parse response ", e));
                        }
                    }
                })
                .setMethod(Request.Method.PATCH)
                .setUrl("/videos/" + videoId + "/captions/" + language)
                .setErrorListener(error -> {
                    if (error.networkResponse.statusCode >= 500) {
                        responseErrorListener.onErrorResponse(new ServerException("ServerException " + error.networkResponse.statusCode, error));
                    } else if (error.networkResponse.statusCode >= 400) {
                        responseErrorListener.onErrorResponse(new ClientException("ClientException " + error.networkResponse.statusCode, error));
                    }
                });
        requestExecutor.execute(requestBuilder);
    }
