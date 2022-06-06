@SuppressWarnings("unchecked")
    public static Stream getOutputStream(Object obj, String name) {
        try {
            Set<Field> fields = getAllFields(obj.getClass(), withOutputStream(name));
            if (fields != null && !fields.isEmpty()) {
                Field field = fields.iterator().next();
                Object candidate = FieldUtils.readField(field, obj, true);
                return (Stream) candidate;
            }
        } catch (Exception e) {
            throw new IllegalArgumentException("Unable to get output stream " + name + " from " + obj, e);
        }
        throw new IllegalArgumentException("Unable to get output stream " + name + " from " + obj);
    }
