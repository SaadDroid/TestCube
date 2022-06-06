@Override
    public String getHeaderString(String header) {
        List<Object> methodValues = metadata.get(header);
        return HttpUtils.getHeaderString(toListOfStrings(methodValues));
    }
