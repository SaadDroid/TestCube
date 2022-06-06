public int[] downloadCohorts() {
        int[] result = new int[3];
        try {
            List<Cohort> cohorts = downloadCohortsList();
            List<Cohort> voidedCohorts = deleteVoidedCohorts(cohorts);
            cohorts.removeAll(voidedCohorts);
            cohortController.saveOrUpdateCohorts(cohorts);
            Log.i(getClass().getSimpleName(), "New cohorts are saved");
            result[0] = SUCCESS;
            result[1] = cohorts.size();
            result[2] = voidedCohorts.size();
        } catch (CohortController.CohortDownloadException e) {
            Log.e(getClass().getSimpleName(), "Exception when trying to download cohorts", e);
            result[0] = SyncStatusConstants.DOWNLOAD_ERROR;
            return result;
        } catch (CohortController.CohortSaveException e) {
            Log.e(getClass().getSimpleName(), "Exception when trying to save cohorts", e);
            result[0] = SyncStatusConstants.SAVE_ERROR;
            return result;
        } catch (CohortController.CohortDeleteException e) {
            Log.e(getClass().getSimpleName(), "Exception occurred while deleting voided cohorts", e);
            result[0] = SyncStatusConstants.DELETE_ERROR;
            return result;
        }
        return result;
    }
