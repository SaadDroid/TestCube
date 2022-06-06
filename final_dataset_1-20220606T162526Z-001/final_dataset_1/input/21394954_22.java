public static boolean isExpression(String value) {
        return value != null && value.startsWith("${") && value.endsWith("}");
    }
