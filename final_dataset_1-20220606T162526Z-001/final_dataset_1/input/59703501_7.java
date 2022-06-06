@Override
    public FetchedData fetch(Resource resource) throws Exception {
        LOG.info("HtmlUnit FETCHER {}", resource.getUrl());
        FetchedData fetchedData;
        try {
            String userAgent = getUserAgent();
            if (StringUtils.isNotBlank(userAgent)) {
                driver.removeRequestHeader(USER_AGENT);
                driver.addRequestHeader(USER_AGENT, userAgent);
            }
            Page page = driver.getPage(resource.getUrl());

            WebResponse response = page.getWebResponse();
            boolean truncated = false;
            try (InputStream stream = response.getContentAsStream()) {
                try (BoundedInputStream boundedStream = new BoundedInputStream(stream, CONTENT_LIMIT)) {
                    try (ByteArrayOutputStream out = new ByteArrayOutputStream()) {
                        IOUtils.copy(boundedStream, out);
                        fetchedData = new FetchedData(out.toByteArray(), response.getContentType(), response.getStatusCode());
                        long contentLength = page.getWebResponse().getContentLength();
                        if (contentLength > 0 && contentLength < Integer.MAX_VALUE) {
                            fetchedData.setContentLength((int) contentLength);
                            truncated = (contentLength > fetchedData.getContentLength());
                            if (truncated) {
                                LOG.info("Content Truncated: {}, TotalSize={}", resource.getUrl(), contentLength);
                            }
                        }
                    }
                }
            }
            resource.setStatus(ResourceStatus.FETCHED.toString());

            List<NameValuePair> respHeaders = page.getWebResponse().getResponseHeaders();
            Map<String, List<String>> headers = new HashMap<>();
            fetchedData.setHeaders(headers);
            if (respHeaders != null && !respHeaders.isEmpty()){
                respHeaders.forEach(item -> {
                    if (!headers.containsKey(item.getName())) {
                        headers.put(item.getName(), new ArrayList<>());
                    }
                    headers.get(item.getName()).add(item.getValue());
                });
            }
            if (truncated){ //add truncated header
                headers.put(TRUNCATED, Collections.singletonList(Boolean.TRUE.toString()));
            }
        } catch (Exception e){
            LOG.warn(e.getMessage(), e);
            fetchedData = new FetchedData(new byte[0], "unknown/unknown", 0); // fixme: use proper status code
            resource.setStatus(ResourceStatus.ERROR.toString());
        }
        fetchedData.setResource(resource);
        return fetchedData;
    }
