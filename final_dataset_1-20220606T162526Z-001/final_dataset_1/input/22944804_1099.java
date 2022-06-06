public Map<String, String> getScopeDescriptions(Locale locale) throws ServerException {
        final Set<String> combinedScopes = new HashSet<>();
        combinedScopes.addAll(getAllowedGrantScopes());
        combinedScopes.addAll(getDefaultGrantScopes());
        return getTranslations(locale, combinedScopes, providerSettings.getSupportedScopesWithTranslations());
    }
