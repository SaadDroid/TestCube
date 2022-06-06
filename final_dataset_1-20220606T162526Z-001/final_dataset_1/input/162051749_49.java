public final <T> ResultIterator<T> runQueryWithIterator(RowConverter<T> converter, String sql, List<?> args) {
        Validate.notNull(converter, "converter must not be null");
        Validate.notEmpty(sql, "sql must not be empty");
        Validate.notNull(args, "args must not be null");
        return runQueryWithIterator(converter, new BasicQuery(sql, args));
    }
