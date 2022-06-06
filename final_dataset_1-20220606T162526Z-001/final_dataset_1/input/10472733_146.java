public String map(Patient patient, FormData formData, User loggedInUser, boolean isLoggedInUserIsDefaultProvider) {
        JSONObject prepopulateJSON = new JSONObject();
        JSONObject patientDetails = new JSONObject();
        JSONObject encounterDetails = new JSONObject();

        try {
            patientDetails.put("patient.medical_record_number", StringUtils.defaultString(patient.getIdentifier()));
            patientDetails.put("patient.given_name", StringUtils.defaultString(patient.getGivenName()));
            patientDetails.put("patient.middle_name", StringUtils.defaultString(patient.getMiddleName()));
            patientDetails.put("patient.family_name", StringUtils.defaultString(patient.getFamilyName()));
            patientDetails.put("patient.sex", StringUtils.defaultString(patient.getGender()));
            patientDetails.put("patient.uuid", StringUtils.defaultString(patient.getUuid()));
            if (patient.getBirthdate() != null) {
                patientDetails.put("patient.birth_date", DateUtils.getFormattedDate(patient.getBirthdate()));
            }
            encounterDetails.put("encounter.form_uuid", StringUtils.defaultString(formData.getTemplateUuid()));
            encounterDetails.put("encounter.user_system_id", StringUtils.defaultString(formData.getUserSystemId()));

            if (isLoggedInUserIsDefaultProvider) {
                encounterDetails.put("encounter.provider_id_select", loggedInUser.getSystemId());
                encounterDetails.put("encounter.provider_id", loggedInUser.getSystemId());
            }

            if (!patient.getIdentifiers().isEmpty()) {
                List<PatientIdentifier> patientIdentifiers = patient.getIdentifiers();

                JSONArray identifierTypeName = new JSONArray();
                JSONArray identifierValue = new JSONArray();

                for (PatientIdentifier identifier : patientIdentifiers) {
                    if (identifier.getIdentifier() != null && !(identifier.getIdentifier().equals(patient.getIdentifier()) || identifier.getIdentifier().equals(patient.getUuid()))) {
                        identifierTypeName.put(StringUtils.defaultString(identifier.getIdentifierType().getName()));
                        identifierValue.put(StringUtils.defaultString(identifier.getIdentifier()));
                    }
                }
                prepopulateJSON.put("other_identifier_type", identifierTypeName);
                prepopulateJSON.put("other_identifier_value", identifierValue);
            }
            prepopulateJSON.put("patient", patientDetails);
            prepopulateJSON.put("encounter", encounterDetails);
        } catch (JSONException e) {
            Log.e(getClass().getSimpleName(), "Could not populate patient registration data to JSON", e);
        }
        return prepopulateJSON.toString();
    }
