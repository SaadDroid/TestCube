@SuppressWarnings("unchecked")
    @Override
    public String execute(Locale locale, Map mapParams) throws WorkflowException {
        try {
            validatePresenceOfMandatoryParams(mapParams);
            final JarInputStream soapSTSServerWar = getJarInputStream();
            final Path outputJarPath = getOutputJarFilePath(getStringParam(mapParams, REALM_PARAM));
            final JarOutputStream modifiedSoapSTSServerWar = getJarOutputStream(outputJarPath, soapSTSServerWar.getManifest());
            processFileContents(soapSTSServerWar, modifiedSoapSTSServerWar, mapParams);
            return getCompletionMessage(locale, outputJarPath);
        } catch (WorkflowException e) {
            Debug.getInstance("workflow").error("Exception caught in CreateSoapSTSDeployment#execute: " + e.getMessage());
            throw e;
        }
    }
