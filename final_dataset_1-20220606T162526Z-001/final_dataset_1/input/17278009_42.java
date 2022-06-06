public List<MongoDBChangeSet> findByDriftCriteria(DriftCriteria criteria) {
        Query<MongoDBChangeSet> query = createQuery();

        if (criteria.getFilterId() != null) {
            // TODO use the $slice operator
            // The slice operator will allow us to return only the requested entry in the
            // change set document. Morphia does not yet support the $slice operator so
            // we will hae to drop down to the mongo driver to issue a query.
            String[] ids = criteria.getFilterId().split(":");
            ObjectId changeSetId = new ObjectId(ids[0]);
            query.field("id").equal(changeSetId);

            // If the id filter is set, there is no need to process other filters since the id
            // filter uniquely identifies both the change set and the drift entry.
            return query.asList();
        }

        if (criteria.getFilterChangeSetId() != null && !criteria.getFilterChangeSetId().isEmpty()) {
            query.field("id").equal(new ObjectId(criteria.getFilterChangeSetId()));
            return query.asList();
        }

        if (criteria.getFilterResourceIds() != null && criteria.getFilterResourceIds().length > 0) {
            query.field("resourceId").in(asList(criteria.getFilterResourceIds()));
        }

        if (criteria.getFilterCategories() != null && criteria.getFilterCategories().length > 0) {
            query.field("files.category").in(asList(criteria.getFilterCategories()));
        }

        if (criteria.getFilterStartTime() != null) {
            query.field("files.ctime").greaterThanOrEq(criteria.getFilterStartTime());
        }

        if (criteria.getFilterEndTime() != null) {
            query.field("files.ctime").lessThanOrEq(criteria.getFilterEndTime());
        }

        if (criteria.getFilterPath() != null && !criteria.getFilterPath().isEmpty()) {
            query.field("files.path").equal(criteria.getFilterPath());
        }

        return query.asList();
    }
