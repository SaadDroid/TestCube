public static SingleCellAnalyticsSchemaField factorAsSchemaField(String factor) {
        return new SingleCellAnalyticsSchemaField(
                String.format("factor_%s", factor),
                metadataFieldNameToDisplayName(factor, "characteristic_"));
    }
