@Override
    public String execute(List<String> parameterList, TestContext context) {
        if (CollectionUtils.isEmpty(parameterList) || parameterList.size() < 1) {
            throw new InvalidFunctionUsageException("Invalid function parameter usage! Missing parameters!");
        }
        
        String charset = "UTF-8";
        if (parameterList.size() > 1) {
            charset = parameterList.get(1);
        }
        
        try {
            return Base64.encodeBase64String(parameterList.get(0).getBytes(charset));
        } catch (UnsupportedEncodingException e) {
            throw new CitrusRuntimeException("Unsupported character encoding", e);
        }
    }
