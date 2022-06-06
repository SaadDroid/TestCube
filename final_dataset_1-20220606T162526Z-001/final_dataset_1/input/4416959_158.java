public Asset getAsset(Resource baseResource, String path, Locale locale)
    {
        return getAssetInLocale(baseResource, path, defaulted(locale));
    }
