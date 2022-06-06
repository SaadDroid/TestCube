public static String getHttpMethodValue(Method m) {
        for (Annotation a : m.getAnnotations()) {
            HttpMethod httpM = a.annotationType().getAnnotation(HttpMethod.class);
            if (httpM != null) {
                return httpM.value();
            }
        }
        return null;
    }
