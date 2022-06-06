public int[] downloadPatientsForCohorts(String[] cohortUuids) {
        int[] result = new int[4];

        int patientCount = 0;
        try {
            long startDownloadCohortData = System.currentTimeMillis();

            List<CohortData> cohortDataList = cohortController.downloadCohortData(cohortUuids, getDefaultLocation());

            long endDownloadCohortData = System.currentTimeMillis();
            Log.i(getClass().getSimpleName(), "Cohort data download successful with " + cohortDataList.size() + " cohorts");
            ArrayList<Patient> voidedPatients = new ArrayList<>();
            List<Patient> cohortPatients;
            for (CohortData cohortData : cohortDataList) {
                cohortController.addCohortMembers(cohortData.getCohortMembers());
                cohortPatients = cohortData.getPatients();
                getVoidedPatients(voidedPatients, cohortPatients);
                cohortPatients.removeAll(voidedPatients);
                patientController.replacePatients(cohortPatients);
                patientCount += cohortData.getPatients().size();
            }
            patientController.deletePatient(voidedPatients);
            long cohortMemberAndPatientReplaceTime = System.currentTimeMillis();

            Log.i(getClass().getSimpleName(), "Cohort data replaced");
            Log.i(getClass().getSimpleName(), "Patients downloaded " + patientCount);
            Log.d(getClass().getSimpleName(), "In Downloading cohort data: " + (endDownloadCohortData - startDownloadCohortData) / 1000 + " sec\n" +
                    "In Replacing cohort members and patients: " + (cohortMemberAndPatientReplaceTime - endDownloadCohortData) / 1000 + " sec");

            result[0] = SUCCESS;
            result[1] = patientCount;
            result[2] = cohortDataList.size();
            result[3] = voidedPatients.size();

            //update memberships
            downloadRemovedCohortMembershipData(cohortUuids);

            cohortController.markAsUpToDate(cohortUuids);
            cohortController.setSyncStatus(cohortUuids);
        } catch (CohortController.CohortDownloadException e) {
            Log.e(getClass().getSimpleName(), "Exception thrown while downloading cohort data.", e);
            result[0] = SyncStatusConstants.DOWNLOAD_ERROR;
        } catch (CohortController.CohortReplaceException e) {
            Log.e(getClass().getSimpleName(), "Exception thrown while replacing cohort data.", e);
            result[0] = SyncStatusConstants.REPLACE_ERROR;
        } catch (PatientController.PatientSaveException e) {
            Log.e(getClass().getSimpleName(), "Exception thrown while replacing patients.", e);
            result[0] = SyncStatusConstants.REPLACE_ERROR;
        } catch (PatientController.PatientDeleteException e) {
            Log.e(getClass().getSimpleName(), "Exception thrown while deleting patients.", e);
            result[0] = SyncStatusConstants.DELETE_ERROR;
        } catch (CohortController.CohortUpdateException e) {
            Log.e(getClass().getSimpleName(), "Exception thrown while marking cohorts as updated.", e);
            result[0] = SyncStatusConstants.SAVE_ERROR;
        }
        return result;
    }
