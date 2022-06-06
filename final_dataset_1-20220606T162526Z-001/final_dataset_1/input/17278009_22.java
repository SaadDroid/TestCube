@Override
    public PageList<? extends DriftChangeSet<?>> findDriftChangeSetsByCriteria(Subject subject,
        DriftChangeSetCriteria criteria) {
        Mapper mapper = new Mapper();
        List<MongoDBChangeSet> changeSets = changeSetDAO.findByChangeSetCritiera(criteria);
        PageList<DriftChangeSetDTO> results = new PageList<DriftChangeSetDTO>();

        for (MongoDBChangeSet changeSet : changeSets) {
            DriftChangeSetDTO changeSetDTO = mapper.toDTO(changeSet);
            if (criteria.isFetchDrifts()) {
                Set<DriftDTO> entries = new HashSet<DriftDTO>();
                for (MongoDBChangeSetEntry entry : changeSet.getDrifts()) {
                    DriftDTO driftDTO = mapper.toDTO(entry);
                    driftDTO.setChangeSet(changeSetDTO);
                    entries.add(driftDTO);
                }
                changeSetDTO.setDrifts(entries);
            }
            results.add(changeSetDTO);
        }

        return results;
    }
