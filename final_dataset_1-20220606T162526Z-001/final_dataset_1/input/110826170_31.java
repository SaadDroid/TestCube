void verifyPhoneNumber(String phoneNumber, boolean forceResend) {
        sendCode(phoneNumber, forceResend);
        if (forceResend) {
            showLoadingDialog(getString(R.string.resending));
        } else {
            showLoadingDialog(getString(R.string.verifying));
        }
    }
