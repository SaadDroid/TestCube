protected String extractProcessDefinitionUUID(final String formId) {
        final StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\\");
        stringBuilder.append(FormServiceProviderUtil.FORM_ID_SEPARATOR);
        final String processDefinitionUUID;
        final String formUUID = formId.split(stringBuilder.toString())[0];
        final String[] splitedFormUUID = formUUID.split(FormWorkflowAPIImpl.UUID_SEPARATOR);
        final StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(splitedFormUUID[0]);
        stringBuilder2.append(FormWorkflowAPIImpl.UUID_SEPARATOR);
        stringBuilder2.append(splitedFormUUID[1]);
        processDefinitionUUID = stringBuilder2.toString();
        return processDefinitionUUID;
    }
