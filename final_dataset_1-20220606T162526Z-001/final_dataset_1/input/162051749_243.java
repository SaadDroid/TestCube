@Override
    public List<UrlDate> getDates(String url) {
        List<UrlDate> result = new ArrayList<UrlDate>();
        for (DateFormat dateFormat : RegExp.URL_DATES) {
            ExtractedDate extractedDate = DateParser.findDate(url, dateFormat);
            if (extractedDate != null) {
                result.add(new UrlDate(extractedDate, url));
                break;
            }
        }
        return result;
    }
