public static <T> DataResponse<T> forType(Class<T> type) {
        return new DataResponse<>(type);
    }
