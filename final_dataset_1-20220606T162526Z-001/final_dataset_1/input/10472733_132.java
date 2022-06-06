public void saveAllCohorts(List<Cohort> cohorts) throws CohortSaveException {
        try {
            cohortService.saveCohorts(cohorts);
        } catch (IOException e) {
            throw new CohortSaveException(e);
        }
    }
