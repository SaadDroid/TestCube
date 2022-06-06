public boolean isRegistrationForm(){
        return Constants.FORM_DISCRIMINATOR_REGISTRATION.equalsIgnoreCase(getDiscriminator()) ||
                Constants.FORM_JSON_DISCRIMINATOR_REGISTRATION.equalsIgnoreCase(getDiscriminator()) ||
                Constants.FORM_JSON_DISCRIMINATOR_GENERIC_REGISTRATION.equalsIgnoreCase(getDiscriminator()) ||
                Constants.FORM_JSON_DISCRIMINATOR_SHR_REGISTRATION.equalsIgnoreCase(getDiscriminator());
    }
