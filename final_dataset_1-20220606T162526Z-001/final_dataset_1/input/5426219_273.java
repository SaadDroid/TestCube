public static String metadataFieldNameToDisplayName(String metadataFieldName) {
        // The metadata fields are either characteristics or factors
        if (metadataFieldName.startsWith("characteristic")) {
            return metadataFieldNameToDisplayName(metadataFieldName, "characteristic_");
        } else {
            return metadataFieldNameToDisplayName(metadataFieldName, "factor_");
        }
    }
