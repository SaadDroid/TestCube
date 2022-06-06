public void setNonPersistentLocaleFromLocaleName(String localeName)
    {
        Locale requested = toLocale(localeName);

        Locale supported = findClosestSupportedLocale(requested);

        threadLocale.setLocale(supported);
    }
