public static List<String> extract(UrlList urlList) {
        Validate.notNull(urlList, "URL list is null");

        List<String> urls = new ArrayList<>(urlList.size());
        for (int i = 0; i < urlList.size(); i++) {
            String url = urlList.current();
            urls.add(url);
            urlList.fail(url);
        }
        return urls;
    }
