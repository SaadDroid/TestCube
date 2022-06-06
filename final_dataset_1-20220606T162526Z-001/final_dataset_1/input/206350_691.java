@SuppressWarnings("unchecked")
    public static <T> Property<T> create(String name, Class<? super T> type) {
        return (Property<T>)new Property<>(name, type);
    }
