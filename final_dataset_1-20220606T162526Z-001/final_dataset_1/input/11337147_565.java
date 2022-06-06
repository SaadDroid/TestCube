public IItem find(final APIID taskId) {
        try {
            return journal.get(taskId);
        } catch (final APIItemNotFoundException e) {
            final Map<String, String> filters = new HashMap<String, String>();
            filters.put(ArchivedActivityItem.ATTRIBUTE_SOURCE_OBJECT_ID, taskId.toString());
            final ItemSearchResult<ArchivedTaskItem> result = archives.search(0, 1, null, ArchivedActivityItem.ATTRIBUTE_ARCHIVED_DATE + " "
                    + Order.DESC, filters);
            if (result.getResults().isEmpty()) {
                throw new APIItemNotFoundException(ArchivedTaskDefinition.TOKEN, taskId);
            }
            return result.getResults().get(0);
        }
    }
