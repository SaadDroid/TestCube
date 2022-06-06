public boolean checkLicenseAcceptance() {
        if (!accepted) {
            debug.log("License not yet accepted.");

            user.tell(MSG_LICENSE_HEADER);

            try {
                licensePresenter.presentLicenses(accepted);
                accepted = true;
                debug.log("License agreement accepted by user.");
            } catch (MissingLicenseException ex) {
                debug.log("License file not found: " + ex.getLicenseName());
                user.tell(MSG_ERROR_NO_LICENSE_FILE);
                throw ex;
            } catch (LicenseRejectedException ex) {
                accepted = false;
                debug.log("User rejected license: " + ex.getRejectedLicense().getFilename());
            }
        } else {
            debug.log("License already accepted by the user");
        }

        return accepted;
    }
