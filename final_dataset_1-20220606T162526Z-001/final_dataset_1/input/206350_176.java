void compact() {
        addEmptyElements();

        compactColumnFilters();
        compactRelationshipFilters();
        compactTableFilter();
        compactProcedureFilter();
        compactSchemas();

        clearGlobalFilters();
    }
