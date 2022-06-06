public void checkRegisterContext(RegisterContext registerContext) throws MissingRequestParameterException {

        if (nullOrEmpty(registerContext.getContextRegistrationList()))  {
            throw new MissingRequestParameterException("contextRegistrations", "List<ContextRegistration>");
        }
        for (ContextRegistration contextRegistration : registerContext.getContextRegistrationList()) {
            checkContextRegistration(contextRegistration);
        }
    }
