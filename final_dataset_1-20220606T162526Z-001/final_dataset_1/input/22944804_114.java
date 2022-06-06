public static String getMetaAliasByUri(String uri) {
        if (uri == null) {
            return null;
        }

        final int index = uri.indexOf(SAML2MetaManager.NAME_META_ALIAS_IN_URI);
        final int marker = index + SAML2MetaManager.NAME_META_ALIAS_IN_URI.length();
        if (index == -1 || marker == uri.length()) {
            return null;
        }

        return uri.substring(marker);
    }
