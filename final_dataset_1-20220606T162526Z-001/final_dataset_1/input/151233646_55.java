@Nonnull
    public <T> T toPOJO(@Nonnull final FluxRecord record, @Nonnull final Class<T> clazz) {

        Objects.requireNonNull(record, "Record is required");
        Objects.requireNonNull(clazz, "Class type is required");

        try {
            T pojo = clazz.newInstance();

            Class<?> currentClazz = clazz;
            while (currentClazz != null) {

                Field[] fields = currentClazz.getDeclaredFields();
                for (Field field : fields) {
                    Column anno = field.getAnnotation(Column.class);
                    String columnName = field.getName();
                    if (anno != null && !anno.name().isEmpty()) {
                        columnName = anno.name();
                    }

                    Map<String, Object> recordValues = record.getValues();

                    String col = null;

                    if (recordValues.containsKey(columnName)) {
                        col = columnName;
                    } else if (recordValues.containsKey("_" + columnName)) {
                        col = "_" + columnName;
                    }

                    if (col != null) {
                        Object value = record.getValueByKey(col);

                        setFieldValue(pojo, field, value);
                    }
                }

                currentClazz = currentClazz.getSuperclass();
            }
            return pojo;
        } catch (Exception e) {
            throw new InfluxException(e);
        }
    }
