@PublicAPI(usage = ACCESS)
    public JavaClasses importUrl(URL url) {
        return importUrls(singletonList(url));
    }
