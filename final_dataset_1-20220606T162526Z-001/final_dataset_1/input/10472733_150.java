@Override
    public int compare(Patient patient1, Patient patient2) {
        if (patient1 == null) {
            patient1 = new Patient();
        }
        if (patient2 == null) {
            patient2 = new Patient();
        }
        int familyNameCompareResult = StringUtils.nullSafeCompare(patient1.getFamilyName(), patient2.getFamilyName());
        if (familyNameCompareResult != 0) {
            return familyNameCompareResult;
        }
        int givenNameCompareResult = StringUtils.nullSafeCompare(patient1.getGivenName(), patient2.getGivenName());
        if (givenNameCompareResult != 0) {
            return givenNameCompareResult;
        }
        return StringUtils.nullSafeCompare(patient1.getMiddleName(), patient2.getMiddleName());
    }
