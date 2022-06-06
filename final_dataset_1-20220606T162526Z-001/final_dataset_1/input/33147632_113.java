public static String buildUserAgent(String clientName, String version) {
        final StringBuilder ua = new StringBuilder(clientName)
                .append('/').append(version)
                        // NOTE: We currently do not provide client_version_code information.
                .append(' ')
                .append(Build.MODEL).append('/').append(Build.VERSION.RELEASE)
                .append(" (")
                .append(Build.MANUFACTURER).append(';')
                .append(Build.MODEL).append(';')
                .append(Build.BRAND).append(';')
                .append(Build.PRODUCT)
                        // NOTE: We do not add client_source, preload, or wifi information.
                .append(')');
        return normalizeString(ua.toString());
    }
