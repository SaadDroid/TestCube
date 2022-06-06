public static String getResponseContentString(HttpGet httpget, CloseableHttpClient httpClient) {
        String responseContent = null;
        CloseableHttpResponse response = null;
        try {
            response = httpClient.execute(httpget);
            // check response status is 200
            if (response.getStatusLine().getStatusCode() == 200) {
                HttpEntity entity = response.getEntity();
                if (entity != null) {
                    responseContent = EntityUtils.toString(entity, Constants.UTF_8);
                } else {
                    logger.warn("http entity is null");
                }
            } else {
                logger.error("http get:{} response status code is not 200!", response.getStatusLine().getStatusCode());
            }
        } catch (IOException ioe) {
            logger.error(ioe.getMessage(), ioe);
        } finally {
            try {
                if (response != null) {
                    EntityUtils.consume(response.getEntity());
                    response.close();
                }
            } catch (IOException e) {
                logger.error(e.getMessage(), e);
            }
            if (!httpget.isAborted()) {
                httpget.releaseConnection();
                httpget.abort();
            }

        }
        return responseContent;
    }
