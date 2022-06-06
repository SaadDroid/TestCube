public static Map<String, Object> getParameterMap(HttpServletRequest request) {
        return getParameterMap(request, x -> true);
    }
