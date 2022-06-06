@Override
    public String execute(List<String> parameterList, TestContext context) {
        if (CollectionUtils.isEmpty(parameterList)) {
            throw new InvalidFunctionUsageException("Missing file path function parameter");
        }

        boolean base64 = parameterList.size() > 1 ? Boolean.valueOf(parameterList.get(1)) : false;

        try {
            if (base64) {
                return Base64.encodeBase64String(FileCopyUtils.copyToByteArray(FileUtils.getFileResource(parameterList.get(0), context).getInputStream()));
            } else {
                return context.replaceDynamicContentInString(FileUtils.readToString(FileUtils.getFileResource(parameterList.get(0), context), FileUtils.getCharset(parameterList.get(0))));
            }
        } catch (IOException e) {
            throw new CitrusRuntimeException("Failed to read file", e);
        }
    }
