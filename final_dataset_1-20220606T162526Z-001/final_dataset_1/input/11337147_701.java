@Get("json")
    public BusinessDataReferenceClient getProcessBusinessDataReference() throws DataNotFoundException {
        final String businessDataName = getPathParam("dataName");
        final Long processInstanceId = getPathParamAsLong("caseId");
        return toClient(bdmAPI.getProcessBusinessDataReference(businessDataName, processInstanceId));
    }
