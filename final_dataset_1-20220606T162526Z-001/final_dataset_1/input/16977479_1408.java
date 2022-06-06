public static Type getGenericResponseType(Method invoked,
                                        Class<?> serviceCls,
                                        Object targetObject,
                                        Class<?> targetType,
                                        Exchange exchange) {
        if (targetObject == null) {
            return null;
        }
        Type type = null;
        if (GenericEntity.class.isAssignableFrom(targetObject.getClass())) {
            type = processGenericTypeIfNeeded(serviceCls, targetType, ((GenericEntity<?>)targetObject).getType());
        } else if (invoked == null
                   || !invoked.getReturnType().isAssignableFrom(targetType)) {
            // when a method has been invoked it is still possible that either an ExceptionMapper
            // or a ResponseHandler filter overrides a response entity; if it happens then
            // the Type is the class of the response object, unless this new entity is assignable
            // to invoked.getReturnType(); same applies to the case when a method returns Response
            type = targetObject.getClass();
        } else {
            type = processGenericTypeIfNeeded(serviceCls, targetType,  invoked.getGenericReturnType());
        }

        return type;
    }
