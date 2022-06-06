@Deprecated
    public static String findSqlOnClasspath(Class<?> type, String methodName) {
        return Holder.INSTANCE.locate(type, methodName);
    }
