public static boolean getOptionalBooleanParam(Map<String, String> parameters, String paramKey) {
        String param = InputParamUtil.getOptionalParam(parameters, paramKey);
        return Boolean.parseBoolean(param);
    }
