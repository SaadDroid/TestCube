public static int getFirstUnusedPort(String hostname, int start, int increment) {
        for (int i = start; i < 65500; i += increment) {
            if (isPortInUse(hostname, i)) {
                return i;
            }
        }
        return -1;
    }
