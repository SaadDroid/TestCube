public Map<String, String> getAppToAppServerMapping(List<String> appServerList) {
        Map<String, String> map = new HashMap<>();
        if (appServerList==null || appServerList.isEmpty()) {
            return map;
        }
        List<ResourceEntity> resultList = resourceRepository.getAppToAppServerMapping(appServerList);
        for (ResourceEntity entity : resultList) {
            for (ConsumedResourceRelationEntity rel: entity.getConsumedMasterRelations()) {
                map.put(rel.getSlaveResource().getName(), entity.getName());
                break; //einmal zuweisen genügt
            }
            
        }
        return map;
    }
