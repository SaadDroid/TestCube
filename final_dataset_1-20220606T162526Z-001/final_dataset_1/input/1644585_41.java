@Override
    public boolean matchesSafely(JsonNode jsonNode) {
        
        Object jsonPathResult = null;
        
        try {
            
            jsonPathResult = JsonPath.read(jsonNode.toString(), jsonPath);
            
            if (matcher == null) {
                return jsonPathResult != null;
            }
            
            boolean initialMatchResult = matcher.matches(jsonPathResult);
            
            // if matcher is for longs and jsonPath returns an integer, do our best
            if (!initialMatchResult && jsonPathResult instanceof Integer) {
                return matcher.matches(intToLong(jsonPathResult));
            }
            
            return initialMatchResult;
        } catch (InvalidPathException e) {
            return false;
        } catch (ClassCastException cce) {
            
            if (matcher.matches(intToLong(jsonPathResult))) {
                return true;
                
            } else {
                throw new RuntimeJsonTypeMismatchException("JSONpath returned a type unsuitable for matching with the given matcher: " + cce.getMessage(), cce);
                
            }
            
        }
        
    }
