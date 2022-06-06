public static String toJsonString(Object object, SerializationFeature feature) {
        try {
            ObjectWriter writer = objectMapper.writer(feature);
            return writer.writeValueAsString(object);
        } catch (Exception e) {
            logger.error("object to json exception!", e);
        }

        return null;
    }
