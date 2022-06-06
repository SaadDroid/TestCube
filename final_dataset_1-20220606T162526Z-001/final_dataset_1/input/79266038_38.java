boolean accept(boolean isDirectory, String fileName) {
        if (!isDirectory) {
            return false;
        }

        Integer numericalPid = tryParseInt(fileName);
        return numericalPid != null
            && numericalPid >= LinuxConstants.LOWEST_LEGAL_PID
            && numericalPid < pidMax;
    }
