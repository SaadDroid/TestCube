public int[] downloadObservationsForPatientsByCohortUUIDs(String[] cohortUuids, boolean replaceExistingObservation) {
        int[] result = new int[4];
        List<Patient> patients;
        try {
            patients = patientController.getPatientsForCohorts(cohortUuids);

            List<String> patientlist = new ArrayList();
            for (Patient patient : patients) {
                patientlist.add(patient.getUuid());
            }
            result = downloadObservationsForPatientsByPatientUUIDs(patientlist, replaceExistingObservation);
            if (result[0] != SUCCESS) {
                updateProgressDialog(muzimaApplication.getString(R.string.error_encounter_observation_download));

            }
        } catch (PatientController.PatientLoadException e) {
            Log.e(getClass().getSimpleName(), "Exception thrown while loading patients.", e);
            result[0] = SyncStatusConstants.LOAD_ERROR;
        }
        return result;
    }
