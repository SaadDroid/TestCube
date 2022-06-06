Map<String, String> getPostParams(Request request) throws IOException {
        final Map<String, String> params = new HashMap<>();
        if ("POST".equals(request.method().toUpperCase(Locale.US))) {
            final RequestBody output = request.body();
            if (output instanceof FormBody) {
                final FormBody body = (FormBody) output;
                for (int i = 0; i < body.size(); i++) {
                    params.put(body.encodedName(i), body.value(i));
                }
            }
        }
        return params;
    }
