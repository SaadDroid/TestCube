public List<Cohort> getAllCohorts() throws CohortFetchException {
        try {
            return cohortService.getAllCohorts();
        } catch (IOException e) {
            throw new CohortFetchException(e);
        }
    }
