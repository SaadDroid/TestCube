public static @Nonnull String getDescription(@Nonnull String instanceFingerprint, @Nonnull Server server) {
        return "{ '" + Openstack.FINGERPRINT_KEY + "': '" + instanceFingerprint + "', 'jenkins-scope': 'server:" + server.getId() + "' }";
    }
