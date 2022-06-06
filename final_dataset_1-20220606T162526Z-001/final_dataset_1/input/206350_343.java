Node translate(Property<?> property) {
        if(property == null) {
            return null;
        }

        Node result = translate(property.getExpression());
        if(property.getAlias() != null) {
            return aliased(result, property.getAlias()).build();
        }
        return result;
    }
