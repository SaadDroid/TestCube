@Override
    public PageList<? extends Drift<?, ?>> findDriftsByCriteria(Subject subject, DriftCriteria criteria) {
        Mapper mapper = new Mapper();
        List<MongoDBChangeSetEntry> entries = changeSetDAO.findEntries(criteria);
        PageList<DriftDTO> results = new PageList<DriftDTO>();

        for (MongoDBChangeSetEntry entry : entries) {
            DriftDTO driftDTO = mapper.toDTO(entry);
            if (criteria.isFetchChangeSet()) {
                driftDTO.setChangeSet(mapper.toDTO(entry.getChangeSet()));
            }
            results.add(driftDTO);
        }

        return results;
    }
