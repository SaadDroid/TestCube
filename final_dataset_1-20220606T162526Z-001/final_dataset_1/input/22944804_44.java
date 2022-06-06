public boolean hasRequiredAttributes(DevicePrint devicePrint) {

        boolean hasRequiredAttributes = true;

        hasRequiredAttributes = hasRequiredAttributes && hasRequiredAttribute(FONTS_REQUIRED,
                devicePrint.getInstalledFonts());

        hasRequiredAttributes = hasRequiredAttributes && hasRequiredAttribute(GEO_LOCATION_REQUIRED,
                devicePrint.getLatitude(), devicePrint.getLongitude());

        hasRequiredAttributes = hasRequiredAttributes && hasRequiredAttribute(PLUGINS_REQUIRED,
                devicePrint.getInstalledPlugins());

        hasRequiredAttributes = hasRequiredAttributes && hasRequiredAttribute(SCREEN_PARAMS_REQUIRED,
                devicePrint.getScreenColourDepth(), devicePrint.getScreenHeight(), devicePrint.getScreenWidth());

        hasRequiredAttributes = hasRequiredAttributes && hasRequiredAttribute(TIMEZONE_REQUIRED,
                devicePrint.getTimezone());

        hasRequiredAttributes = hasRequiredAttributes && hasRequiredAttribute(USER_AGENT_REQUIRED,
                devicePrint.getUserAgent());

        return hasRequiredAttributes;
    }
