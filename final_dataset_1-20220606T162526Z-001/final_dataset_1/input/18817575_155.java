<T> void processAfterMapping(ResourceModelMetaData metaData, T model) {
        if (metaData == null) {
            throw new IllegalArgumentException("Method argument metaData must not be null.");
        }
        if (model == null) {
            throw new IllegalArgumentException("Method argument model must not be null.");
        }

        for (MethodMetaData methodMetaData : metaData.getAfterMappingMethods()) {
            Method method = methodMetaData.getMethod();
            makeAccessible(method);
            try {
                method.invoke(model);
            } catch (InvocationTargetException | SecurityException e) {
                logger.error("Unable to invoke the @" + AfterMapping.class.getSimpleName() + " method " + method + ".", e);
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("It must not be illegal to access " + method + ".", e);
            }
        }
    }
