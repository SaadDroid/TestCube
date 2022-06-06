public boolean save(List<PatientDispensation> patientDispensations) throws LMISException {
        return patientDispensationGenericDao.create(patientDispensations);
    }
