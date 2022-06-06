@Override
    public List<Filter> fromString(String filtersJson) {

        JsonNode rootNode = jsonParser.parseJson(filtersJson);
        if (rootNode == null || rootNode.isNull()) {
            return null;
        }

        List<Filter> filters = new ArrayList<>(rootNode.size());

        for (JsonNode filterNode : rootNode) {
            JsonNode propertyNode = filterNode.get(PROPERTY);
            if (propertyNode == null) {
                throw new AgException(Response.Status.BAD_REQUEST, "filter 'property' is missing" + filterNode.asText());
            }

            JsonNode valueNode = filterNode.get(VALUE);
            if (valueNode == null) {
                throw new AgException(Response.Status.BAD_REQUEST, "filter 'value' is missing" + filterNode.asText());
            }

            JsonNode disabledNode = filterNode.get(DISABLED);
            boolean disabled = disabledNode != null && disabledNode.asBoolean();
            String property = propertyNode.asText();

            Object value = extractValue(valueNode);

            // note that 'exactMatch' is ignored everywhere but in a like expression
            JsonNode exactMatchNode = filterNode.get(EXACT_MATCH);
            boolean exactMatch = exactMatchNode != null && exactMatchNode.asBoolean();

            JsonNode operatorNode = filterNode.get(OPERATOR);
            // TODO: operators as enum - instant validation
            String operator = (operatorNode != null) ? operatorNode.asText() : "like";

            filters.add(new Filter(property, value, operator, disabled, exactMatch));
        }

        return filters;
    }
