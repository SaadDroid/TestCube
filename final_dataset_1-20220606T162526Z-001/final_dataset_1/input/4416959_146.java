public boolean setLocaleFromLocaleName(String localeName)
    {
        boolean supported = isSupportedLocaleName(localeName);

        if (supported)
        {
            Locale locale = findClosestSupportedLocale(toLocale(localeName));

            persistentLocale.set(locale);

            threadLocale.setLocale(locale);
        }
        else
        {
            Locale requestLocale = request.getLocale();

            Locale supportedLocale = findClosestSupportedLocale(requestLocale);

            threadLocale.setLocale(supportedLocale);
        }

        return supported;
    }
