protected List<UpgradeUnit> upgradeDOM(Resource resource, List<UpgradeHandler> handlerList) {
        List<UpgradeUnit> allUnits = new ArrayList<>();

        // Load DOM for all resources
        Document projectDocument = Util.readDocument(resource.getURL());
        UpgradeUnit projectUnit = new UpgradeUnit(resource, projectDocument);
        allUnits.add(projectUnit);

        List<Resource> dataMapResources = getAdditionalDatamapResources(projectUnit);
        List<UpgradeUnit> dataMapUnits = new ArrayList<>(dataMapResources.size());
        for (Resource dataMapResource : dataMapResources) {
            dataMapUnits.add(new UpgradeUnit(dataMapResource, Util.readDocument(dataMapResource.getURL())));
        }
        allUnits.addAll(dataMapUnits);

        // Update DOM
        for(UpgradeHandler handler : handlerList) {
            handler.processProjectDom(projectUnit);
            for(UpgradeUnit dataMapUnit : dataMapUnits) {
                handler.processDataMapDom(dataMapUnit);
            }
        }

        return allUnits;
    }
