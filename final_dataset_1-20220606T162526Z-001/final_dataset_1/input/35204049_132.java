public static ImportTransformer getTransformer(String transformerSpec) throws AtlasBaseException {
        String[] params = StringUtils.split(transformerSpec, TRANSFORMER_PARAMETER_SEPARATOR);
        String   key    = (params == null || params.length < 1) ? transformerSpec : params[0];

        final ImportTransformer ret;

        if (StringUtils.isEmpty(key)) {
            throw new AtlasBaseException(AtlasErrorCode.INVALID_VALUE, "Error creating ImportTransformer. Invalid transformer-specification: {}.", transformerSpec);
        } else if (key.equals("replace")) {
            String toFindStr  = (params == null || params.length < 2) ? "" : params[1];
            String replaceStr = (params == null || params.length < 3) ? "" : params[2];

            ret = new Replace(toFindStr, replaceStr);
        } else if (key.equals("lowercase")) {
            ret = new Lowercase();
        } else if (key.equals("uppercase")) {
            ret = new Uppercase();
        } else {
            throw new AtlasBaseException(AtlasErrorCode.INVALID_VALUE, "Error creating ImportTransformer. Unknown transformer: {}.", transformerSpec);
        }

        return ret;
    }
