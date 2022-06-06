@Override
    public Resource<T> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {

        Resource<T> resourceModel = new Resource<T>();

        ObjectMapper mapper = objectMapperFactory.newDeserializerMapper();
        ObjectCodec oc = jsonParser.getCodec();
        JsonNode node = oc.readTree(jsonParser);

        T resource;

        GraphQLProperty graphQLProperty = t.getAnnotation(GraphQLProperty.class);
        if (graphQLProperty != null) {
            String resourceName = graphQLProperty.name();
            JsonNode innerNode = node.get(resourceName);
            resource = mapper.treeToValue(innerNode, t);
        } else {
            resource = mapper.readValue(node.toString(), t);
        }

        resourceModel.setResource(resource);

        return resourceModel;
    }
