private Extractor makeIntExtractor(Field field)
    {
        return (IntExtractor) (Object context, NullableIntHolder dst) ->
        {
            Object fieldValue = ((Map) context).get(field.getName());
            dst.isSet = 1;
            if (fieldValue instanceof Number) {
                dst.value = ((Number) fieldValue).intValue();
            }
            else if (fieldValue instanceof String) {
                dst.value = new Double((String) fieldValue).intValue();
            }
            else if (fieldValue instanceof List) {
                Object value = ((List) fieldValue).get(0);
                if (value instanceof Number) {
                    dst.value = ((Number) value).intValue();
                }
                else if (value instanceof String) {
                    dst.value = new Double((String) value).intValue();
                }
                else {
                    dst.isSet = 0;
                }
            }
            else {
                dst.isSet = 0;
            }
        };
    }
