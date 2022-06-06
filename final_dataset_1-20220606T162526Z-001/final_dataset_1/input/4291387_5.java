@Override
    public PollResult poll(boolean initial, Object checkPoint) throws Exception {
        Map<String, Object> map = new HashMap<String, Object>();

        for(PropertyWithDeploymentContext prop: tableCache.getProperties()){
            if(prop.getContextKey() == contextKey && prop.getContextValue() == null){
                map.put(prop.getPropertyName(), prop.getPropertyValue());
            }
            else if(prop.getContextKey() == contextKey &&
                    prop.getContextValue().equalsIgnoreCase(deploymentContext.getValue(contextKey))){
                map.put(prop.getPropertyName(), prop.getPropertyValue());
            }
        }

        return PollResult.createFull(map);
    }
