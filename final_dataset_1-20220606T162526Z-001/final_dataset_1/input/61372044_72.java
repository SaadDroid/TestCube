public static String getIsolatedPvlanFromUri(final URI uri) {
        final String[] vlans = uri.getHost().split("-");
        if (vlans.length < 2) {
            return null;
        }
        for (final String vlan : vlans) {
            if (vlan.startsWith("i")) {
                return vlan.replace("i", " ").trim();
            }
        }
        return null;
    }
