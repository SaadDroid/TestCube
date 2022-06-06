public static RowMapperFactory factory(Class<?> type) {
        return RowMapperFactory.of(type, BeanMapper.of(type));
    }
