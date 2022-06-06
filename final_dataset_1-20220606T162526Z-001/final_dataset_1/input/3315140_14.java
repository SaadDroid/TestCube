public Map<String, AWSInstanceProfile> getConfiguredProfiles() {
        List<Object> profilesList = configuration.getList(PROFILES, Collections.EMPTY_LIST);
        Map<String, Map<String, String>> profileSpecifications = 
                ConfigurationUtil.reduceObjectList(profilesList, 
                "Profiles must be specified as a list of objects.");
        SortedMap<String, AWSInstanceProfile> profiles = Maps.newTreeMap();
        for (Map.Entry<String, Map<String, String>> entry : profileSpecifications.entrySet()) {
            String profileName = entry.getKey();
            Map<String, String> profileValues = entry.getValue();
            AWSInstanceProfile profile = AWSInstanceProfile.newBuilder().
                    profileName(profileName).
                    region(profileValues.get(REGION)).
                    zone(profileValues.get(ZONE)).
                    type(profileValues.get(TYPE)).
                    amiId(profileValues.get(AMI_ID)).
                    keypairName(profileValues.get(KEYPAIR)).
                    shutdownState(profileValues.get(SHUTDOWN_STATE)).
                    group(profileValues.get(GROUP)).
                    spotPrice(profileValues.get(SPOT_PRICE)).
                    spotRequestType(profileValues.get(SPOT_REQUEST_TYPE)).
                    spotRequestValidFrom(profileValues.get(SPOT_REQUEST_VALID_FROM)).
                    spotRequestValidTo(profileValues.get(SPOT_REQUEST_VALID_TO)).
                    placementGroup(profileValues.get(PLACEMENT_GROUP)).
                    build();
            profiles.put(profileName, profile);
        }
        
        return profiles;
    }
