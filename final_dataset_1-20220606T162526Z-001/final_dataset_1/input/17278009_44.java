public List<MongoDBChangeSetEntry> findEntries(DriftCriteria criteria) {
        // TODO Add support for driftHandlingModes filter

        if (criteria.getFilterId() != null) {
            String[] ids = criteria.getFilterId().split(":");
            ObjectId changeSetId = new ObjectId(ids[0]);
            return asList(findEntryById(changeSetId, ids[1]));
        }

        Query<MongoDBChangeSet> query = createQuery();
        boolean changeSetsFiltered = false;
        boolean entriesFiltered = false;

        ChangeSetEntryFilters filters = new ChangeSetEntryFilters();
        
        if (criteria.getFilterChangeSetId() != null) {
            query.field("id").equal(new ObjectId(criteria.getFilterChangeSetId()));
            changeSetsFiltered = true;
        }

        if (criteria.getFilterResourceIds().length > 0) {
            query.field("resourceId").in(asList(criteria.getFilterResourceIds()));
            changeSetsFiltered = true;
        }
        
        if (criteria.getFilterDriftDefinitionId() != null) {
            query.field("driftDefId").equal(criteria.getFilterDriftDefinitionId());
            changeSetsFiltered = true;
        }

        if (criteria.getFilterChangeSetStartVersion() != null) {
            query.field("version").greaterThanOrEq(criteria.getFilterChangeSetStartVersion());
            changeSetsFiltered = true;
        }

        if (criteria.getFilterChangeSetEndVersion() != null) {
            query.field("version").lessThanOrEq(criteria.getFilterChangeSetEndVersion());
            changeSetsFiltered = true;
        }

        if (criteria.getFilterCategories().length > 0) {
            query.field("files.category").in(asList(criteria.getFilterCategories()));
            entriesFiltered = true;
            filters.add(new CategoryFilter(criteria.getFilterCategories()));
        }

        if (criteria.getFilterEndTime() != null) {
            query.field("files.ctime").lessThanOrEq(criteria.getFilterEndTime());
            entriesFiltered = true;
            filters.add(new CreatedBeforeFilter(criteria.getFilterEndTime()));
        }

        if (criteria.getFilterStartTime() != null) {
            query.field("files.ctime").greaterThanOrEq(criteria.getFilterStartTime());
            entriesFiltered = true;
            filters.add(new CreatedAfterFilter(criteria.getFilterStartTime()));
        }

        if (criteria.getFilterPath() != null && !criteria.getFilterPath().isEmpty()) {
            query.field("files.path").equal(criteria.getFilterPath());
            entriesFiltered = true;
            filters.add(new PathFilter(criteria.getFilterPath()));
        }
        
        if (criteria.getFilterDirectory() != null) {
            query.field("files.directory").equal(criteria.getFilterDirectory());
            entriesFiltered = true;
            filters.add(new DirectoryFilter(criteria.getFilterDirectory()));
        }

        List<MongoDBChangeSetEntry> entries = new ArrayList<MongoDBChangeSetEntry>();

        if (changeSetsFiltered && !entriesFiltered) {
            // If the query only filters on change set fields, we do not need to do any
            // additional filtering since it was already done by the database.
            for (MongoDBChangeSet c : query.asList()) {
                entries.addAll(c.getDrifts());
            }
        } else {
            for (MongoDBChangeSet c : query.asList()) {
                for (MongoDBChangeSetEntry e : c.getDrifts()) {
                    if (filters.matchesAll(e)) {
                        entries.add(e);
                    }
                }
            }
        }

        return entries;
    }
