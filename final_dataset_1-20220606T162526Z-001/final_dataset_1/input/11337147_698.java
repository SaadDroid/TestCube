@Get("json")
    public List<BusinessDataReference> getProcessBusinessDataReferences() {
        final Long processInstanceId = getCaseId();
        final Integer p = getSearchPageNumber();
        final Integer c = getSearchPageSize();
        return bdmAPI.getProcessBusinessDataReferences(processInstanceId, p * c, c);
    }
