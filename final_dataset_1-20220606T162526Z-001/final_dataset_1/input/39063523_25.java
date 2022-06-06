protected boolean validateForm() {
        if (rnRForm != null && rnRForm.isEmergency()) {
            return validateRnrFormItems();
        } else {
            return view.validateConsultationNumber() && validateRnrFormItems();
        }
    }
