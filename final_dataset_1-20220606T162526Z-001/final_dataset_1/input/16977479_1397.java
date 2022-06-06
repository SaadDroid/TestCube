public static void populateMapFromString(MultivaluedMap<String, String> params,
                                             Message m,
                                             String postBody,
                                             String enc,
                                             boolean decode) {
        if (StringUtils.isEmpty(postBody)) {
            return;
        }
        String[] parts = postBody.split("&");
        checkNumberOfParts(m, parts.length);
        for (String part : parts) {
            String[] keyValue = new String[2];
            int index = part.indexOf('=');
            if (index != -1) {
                keyValue[0] = part.substring(0, index);
                keyValue[1] = index + 1 < part.length() ? part.substring(index + 1) : "";
            } else {
                keyValue[0] = part;
                keyValue[1] = "";
            }
            String name = HttpUtils.urlDecode(keyValue[0], enc);
            if (decode) {
                params.add(name, HttpUtils.urlDecode(keyValue[1], enc));
            } else {
                params.add(name, keyValue[1]);
            }
        }

    }
