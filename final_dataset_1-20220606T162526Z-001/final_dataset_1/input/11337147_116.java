public boolean isAllowedToSeeTask(final APISession apiSession, final long taskInstanceId, final long enforcedUserId,
            final boolean assignTask) throws BonitaException {
        final ProcessAPI processAPI = getProcessAPI(apiSession);
        try {
            if (processAPI.isInvolvedInHumanTaskInstance(enforcedUserId, taskInstanceId)) {
                if (assignTask) {
                    assignTaskIfNotAssigned(apiSession, taskInstanceId, enforcedUserId);
                }
                return true;
            }
            return false;
        } catch (final ActivityInstanceNotFoundException e) {
            final ArchivedActivityInstance archivedActivity = processAPI.getArchivedActivityInstance(taskInstanceId);
            return enforcedUserId == archivedActivity.getExecutedBy();
        }
    }
