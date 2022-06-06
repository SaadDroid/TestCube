@Override
    public boolean matchesSafely(JsonNode jsonNode) {
        
        JsonNode node = jsonNode.get(fieldName);
        
        if (node == null) {
            return false;
        }
        
        if (node.isInt()) {
            return valueMatcher.matches(node.intValue());
            
        } else if (node.isLong()) {
            return valueMatcher.matches(node.longValue());
            
        } else if (node.isTextual()) {
            return valueMatcher.matches(node.textValue());
            
        } else if (node.isBoolean()) {
            return valueMatcher.matches(node.booleanValue());
            
        } else if (node.isDouble()) {
            return valueMatcher.matches(node.doubleValue());
            
        } else if (node.isObject()) {
            return valueMatcher.matches(node);
            
        } else if (node.isNull()) {
            return valueMatcher.matches(null);
            
        } else {
            return false;
            
        }
        
    }
