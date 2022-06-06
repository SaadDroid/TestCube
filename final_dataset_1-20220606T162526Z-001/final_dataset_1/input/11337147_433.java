@Override
    public ApplicationItem update(final APIID id, final Map<String, String> attributes) {
        try {
            final ApplicationUpdater applicationUpdater = converter.toApplicationUpdater(attributes);
            final Application application = applicationAPI.updateApplication(id.toLong(), applicationUpdater);
            return converter.toApplicationItem(application);
        } catch (final Exception e) {
            throw new APIException(e);
        }
    }
