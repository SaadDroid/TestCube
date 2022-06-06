public void getVideoAnalytics(String videoId, String period, ResponseListener<AnalyticVideo> analyticsVideoResponseListener, ResponseErrorListener responseErrorListener) {
        RequestBuilder requestBuilder = new RequestBuilder()
                .stringRequest(response -> {
                    try {
                        JSONObject jsonObject = new JSONObject(response);
                        analyticsVideoResponseListener.onResponse(analyticVideoJsonSerializer.deserialize(jsonObject));
                    } catch (JSONException e) {
                        e.printStackTrace();
                        responseErrorListener.onErrorResponse(new ServerException("could not parse response ", e));
                    }
                })
                .setMethod(com.android.volley.Request.Method.GET)
                .setUrl("/analytics/videos/" + videoId + "?period=" + period)
                .setErrorListener(error -> {
                    if (error.networkResponse.statusCode >= 500) {
                        responseErrorListener.onErrorResponse(new ServerException("ServerException " + error.networkResponse.statusCode, error));
                    } else if (error.networkResponse.statusCode >= 400) {
                        responseErrorListener.onErrorResponse(new ClientException("ClientException " + error.networkResponse.statusCode, error));
                    }
                });
        requestExecutor.execute(requestBuilder);
    }
