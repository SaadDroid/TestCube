public String removeCodeFromUrl(String url, String code) {
        return url.replaceFirst("&?code=" + code, "");
    }
