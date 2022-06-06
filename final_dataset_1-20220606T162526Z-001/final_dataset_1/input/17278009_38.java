public List<MongoDBChangeSet> findByChangeSetCritiera(DriftChangeSetCriteria criteria) {
        Query<MongoDBChangeSet> query = createQuery();
        
        if (criteria.getFilterId() != null) {
            // There is no need to apply any additional filters if the id filter is specified
            return query.field("id").equal(new ObjectId(criteria.getFilterId())).asList();
        }
        
        if (criteria.getFilterResourceId() != null) {
            query.field("resourceId").equal(criteria.getFilterResourceId());
        }

        if (criteria.getFilterDriftDefinitionId() != null) {
            query.field("driftDefId").equal(criteria.getFilterDriftDefinitionId());
        }
        
        if (criteria.getFilterVersion() != null) {
            query.field("version").equal(Integer.parseInt(criteria.getFilterVersion()));
        }
        
        if (criteria.getFilterStartVersion() != null) {
            query.field("version").greaterThanOrEq(Integer.parseInt(criteria.getFilterStartVersion()));
        }
        
        if (criteria.getFilterEndVersion() != null) {
            query.field("version").lessThanOrEq(Integer.parseInt(criteria.getFilterEndVersion()));
        }

        if (criteria.getFilterCreatedAfter() != null) {
            query.field("ctime").greaterThanOrEq(criteria.getFilterCreatedAfter());
        }

        if (criteria.getFilterCreatedBefore() != null) {
            query.field("ctime").lessThan(criteria.getFilterCreatedBefore());
        }

        if (criteria.getFilterDriftPath() != null) {
            query.field("files.path").equal(Pattern.compile(".*" + criteria.getFilterDriftPath() + ".*"));
        }
        
        if (criteria.getFilterDriftDirectory() != null) {
            query.field("files.directory").equal(criteria.getFilterDriftDirectory());
        }

        if (criteria.getFilterCategory() != null) {
            query.field("category").equal(criteria.getFilterCategory());
        }
        
        if (criteria.getFilterDriftCategories() != null) {
            query.field("files.category").in(criteria.getFilterDriftCategories());
        }

        if (!criteria.isFetchDrifts()) {
            query.retrievedFields(false, "files");
        }

        if (criteria.getSortVersion() != null) {
            if (criteria.getSortVersion() == PageOrdering.ASC) {
                query.order("version");
            } else {
                query.order("-version");
            }
        }

        return query.asList();
    }
