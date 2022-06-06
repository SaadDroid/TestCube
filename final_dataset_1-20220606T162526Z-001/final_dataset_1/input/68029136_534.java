public boolean hasResourceProvidableSoftlinkType(ResourceEntity resource){
        List<String> providableSoftlinkResourceTypes;
        providableSoftlinkResourceTypes = extractResourceTypeSystemProperties(ConfigKey.PROVIDABLE_SOFTLINK_RESOURCE_TYPES, WS_PPI_TYPE);
        return isTypeOrHasTypeAsSuperType(providableSoftlinkResourceTypes, resource.getResourceType());
    }
