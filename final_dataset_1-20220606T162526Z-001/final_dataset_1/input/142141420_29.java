public static Map<String, Object> fetchChildDetails(Node node) {
        return node.getOutRelations().stream()
                .filter(relation -> StringUtils.equalsIgnoreCase(ASSESSMENT_OBJECT_TYPE, relation.getEndNodeObjectType()))
                .collect(Collectors.toMap(Relation::getEndNodeId, entry -> entry.getMetadata().get(INDEX)));
    }
