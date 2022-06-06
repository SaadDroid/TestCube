void saveProfiles(AMIdentityWrapper amIdentity, List<Map<String, Object>> profiles) {
        try {
            Set<String> vals = new HashSet<String>();
            for (Map<String, Object> profile : profiles) {
                StringWriter writer = new StringWriter();
                MAPPER.writeValue(writer, profile);
                vals.add(writer.toString());
            }

            Map<String, Set> profilesMap = new HashMap<String, Set>();
            profilesMap.put(LDAP_DEVICE_PRINT_ATTRIBUTE_NAME, vals);

            amIdentity.setAttributes(profilesMap);
            amIdentity.store();
            DEBUG.message("Profiles stored");
        } catch (Exception e) {
            DEBUG.error("Could not store profiles. " + e);
        }
    }
