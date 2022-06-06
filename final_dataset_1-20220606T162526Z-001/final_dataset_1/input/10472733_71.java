public List<Patient> searchPatientLocally(String term, String cohortUuid) throws PatientLoadException {
        try {
            return StringUtils.isEmpty(cohortUuid)
                    ? patientService.searchPatients(term)
                    : patientService.searchPatients(term, cohortUuid);
        } catch (IOException | ParseException e) {
            throw new PatientLoadException(e);
        }
    }
