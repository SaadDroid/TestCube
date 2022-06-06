public synchronized static int selectAvailablePort(int defaultPort, int maxLength) {
        for (int i = defaultPort; i < defaultPort + maxLength; i++) {
            try {
                if (available(i)) {
                    return i;
                }
            } catch (IllegalArgumentException e) {
                // Ignore and continue
            }
        }

        return -1;
    }
