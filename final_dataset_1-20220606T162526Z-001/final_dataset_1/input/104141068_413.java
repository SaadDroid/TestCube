static void closeQuietly(final EntityManagerFactory emf) {
        if (emf != null) {
            try {
                emf.close();
            } catch (final Exception ex) {
                LOG.warn("Error closing entity manager factory: {}", ex.getMessage(), ex);
            }
        }
    }
