public Referenceable getEntity(String guid) throws AtlasServiceException {
        ObjectNode jsonResponse = callAPIWithBodyAndParams(API_V1.GET_ENTITY, null, guid);
        String entityInstanceDefinition = AtlasType.toJson(jsonResponse.get(AtlasClient.DEFINITION));
        return AtlasType.fromV1Json(entityInstanceDefinition, Referenceable.class);
    }
