@Get("json")
    public void searchTimerEventTriggers() {
        try {
            final Long caseId = getLongParameter("caseId", true);
            final SearchResult<TimerEventTriggerInstance> searchResult = processAPI.searchTimerEventTriggerInstances(caseId, buildSearchOptions());
            Representation representation = getConverterService().toRepresentation(searchResult.getResult(), MediaType.APPLICATION_JSON);
            representation.setCharacterSet(CharacterSet.UTF_8);
            getResponse().setEntity(representation);
            setContentRange(searchResult);
        } catch (final Exception e) {
            throw new APIException(e);
        }
    }
