public Field[] getFields(@NonNull Class<?> cls) {
        Field[] cachedFields = mCachedFields.get(cls);
        // If the cache is valid, fields will be returned.
        if (cachedFields != null)
            return cachedFields;

        Class<?> currentClass = cls;
        final List<Field> futureCachedFields = new LinkedList<>();
        do {
            Field[] declaredFields = currentClass.getDeclaredFields();
            for (int i = 0; i < currentClass.getDeclaredFields().length; i++) {
                final Field field = declaredFields[i];
                // If the field isn't annotated with @SaveState, the loop will continue to the next field.
                final Annotation annotation = field.getAnnotation(SaveState.class);
                if (annotation == null)
                    continue;

                futureCachedFields.add(field);
            }
        } while // Loop again if there's a superclass of this class.
                ((currentClass = currentClass.getSuperclass()) != null);

        // Create the array from the list.
        cachedFields = futureCachedFields.toArray(new Field[futureCachedFields.size()]);
        // Put the fields in cache.
        mCachedFields.put(cls, cachedFields);
        return cachedFields;
    }
