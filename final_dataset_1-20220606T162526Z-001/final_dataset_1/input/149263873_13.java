@Nonnull
    public static <T> List<T> toList(@Nonnull final Iterable<T> iterable) {
        if (iterable instanceof List) {
            return (List<T>) iterable;
        } else {
            List<T> list = new ArrayList<>();
            for (T item : iterable) {
                list.add(item);
            }
            return list;
        }
    }
