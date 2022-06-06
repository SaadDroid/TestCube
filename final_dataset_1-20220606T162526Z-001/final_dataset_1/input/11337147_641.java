public ProfileEntry getProfileEntry(final Long id) {
        try {
            return profileApi.getProfileEntry(id);
        } catch (final InvalidSessionException e) {
            throw new APIException(e);
        } catch (final ProfileEntryNotFoundException e) {
            throw new APIItemNotFoundException(ProfileEntryDefinition.TOKEN, APIID.makeAPIID(id));
        }
    }
