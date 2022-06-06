public static List<String> getNames(final String fileName) {
        try (final InputStream in = PersistenceUtils.class.getClassLoader().getResourceAsStream(fileName)) {
            if (in == null) {
                return Collections.emptyList();
            }
            return scanPersistenceXml(in);
        } catch (final Exception ex) {
            LOG.warn("Error reading persistence.xml: {}", ex.getMessage(), ex);
            return Collections.emptyList();
        }
    }
