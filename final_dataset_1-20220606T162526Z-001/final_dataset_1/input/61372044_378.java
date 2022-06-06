public static Object fromSerializedString(final String string) {
        if (string == null || string.trim().isEmpty()) {
            return null;
        }

        try {
            final int classNameLimit = string.indexOf(SEPARATOR);
            if (classNameLimit == -1) {
                return null;
            }

            final String className = string.substring(0, classNameLimit);
            final String afterClassName = string.substring(classNameLimit + 1 , string.length());

            final Class<?> clazz;
            try {
                clazz = Class.forName(className);
            } catch (final ClassNotFoundException e) {
                return null;
            }

            final Gson gson = ApiGsonHelper.getBuilder().create();

            final int jsonObjectPosition = afterClassName.indexOf(JSON_OBJECT_START);
            if (jsonObjectPosition == -1) {
                return null;
            }
            if (jsonObjectPosition == 0) {
                return gson.fromJson(afterClassName, clazz);
            }

            final String objectName = afterClassName.substring(0, jsonObjectPosition - 1);
            final String content = afterClassName.substring(jsonObjectPosition, afterClassName.length());
            final Object object = gson.fromJson(content, clazz);
            if (object instanceof ResponseObject) {
                final ResponseObject responseObject = (ResponseObject) object;
                responseObject.setObjectName(objectName);
            }

            return object;
        } catch (final RuntimeException e) {
            s_logger.error("Caught runtime exception when deserializing on: " + string);
            throw e;
        }
    }
