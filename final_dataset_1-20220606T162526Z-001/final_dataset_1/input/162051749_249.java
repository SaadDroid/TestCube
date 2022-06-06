@Override
    public List<ContentDate> getDates(Document document) {
        List<ContentDate> result = getContentDates(document);
        setFeatures(result, document);
        return result;
    }
