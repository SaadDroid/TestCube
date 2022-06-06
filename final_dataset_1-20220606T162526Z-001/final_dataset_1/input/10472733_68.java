public void replacePatients(List<Patient> patients) throws PatientSaveException {
        try {
            patientService.updatePatients(patients);
        } catch (IOException e) {
            throw new PatientSaveException(e);
        }
    }
