public Date getDate() {
        List<String> values = headers.get(HttpHeaders.DATE);
        if (values == null || values.isEmpty() || StringUtils.isEmpty(values.get(0))) {
            return null;
        }
        return HttpUtils.getHttpDate(values.get(0));
    }
