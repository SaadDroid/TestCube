@SuppressWarnings("unchecked")
    Map<?, ?> getRandomMap(final Field field, final RandomizationContext context) {
        int randomSize = getRandomMapSize(context.getParameters());
        Class<?> fieldType = field.getType();
        Type fieldGenericType = field.getGenericType();
        Map<Object, Object> map;

        if (isInterface(fieldType)) {
            map = (Map<Object, Object>) getEmptyImplementationForMapInterface(fieldType);
        } else {
            try {
                map = (Map<Object, Object>) fieldType.newInstance();
            } catch (InstantiationException | IllegalAccessException e) {
                // Creating EnumMap with objenesis by-passes the constructor with keyType which leads to CCE at insertion time
                if (fieldType.isAssignableFrom(EnumMap.class)) {
                    if (isParameterizedType(fieldGenericType)) {
                        Type type = ((ParameterizedType) fieldGenericType).getActualTypeArguments()[0];
                        map = new EnumMap((Class<?>)type);
                    } else {
                        return null;
                    }
                } else {
                    map = (Map<Object, Object>) objectFactory.createInstance(fieldType, context);
                }
            }
        }

        if (isParameterizedType(fieldGenericType)) { // populate only parameterized types, raw types will be empty
            ParameterizedType parameterizedType = (ParameterizedType) fieldGenericType;
            Type keyType = parameterizedType.getActualTypeArguments()[0];
            Type valueType = parameterizedType.getActualTypeArguments()[1];
            if (isPopulatable(keyType) && isPopulatable(valueType)) {
                for (int index = 0; index < randomSize; index++) {
                    Object randomKey = easyRandom.doPopulateBean((Class<?>) keyType, context);
                    Object randomValue = easyRandom.doPopulateBean((Class<?>) valueType, context);
                    if(randomKey != null) {
                        map.put(randomKey, randomValue);
                    }
                }
            }
        }
        return map;
    }
