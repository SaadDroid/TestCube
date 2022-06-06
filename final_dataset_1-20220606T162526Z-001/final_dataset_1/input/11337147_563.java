@Override
    protected SearchResult<ENGINE_ITEM> runSearch(final SearchOptionsBuilder builder, final Map<String, String> filters) {
        try {

            // Using the same id for each test to avoid useless memory usage.
            APIID id = null;

            // Tasks of all users using a specific supervisor's processes.
            id = APIID.makeAPIID(filters.get(HumanTaskItem.FILTER_SUPERVISOR_ID));
            if (id != null) {
                filters.remove(HumanTaskItem.FILTER_SUPERVISOR_ID);
                return runSupervisorSearch(filters, builder, id.toLong());
            }

            // Tasks of all members of a specific team manager's team.
            id = APIID.makeAPIID(filters.get(HumanTaskItem.FILTER_TEAM_MANAGER_ID));
            if (id != null) {
                return runTeamManagerSearch(filters, builder, id.toLong());
            }

            return runGenericSearch(builder, filters);

        } catch (final Exception e) {
            throw new APIException(e);
        }
    }
