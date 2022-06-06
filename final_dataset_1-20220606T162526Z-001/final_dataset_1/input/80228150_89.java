public static void deletePidFileIfOwned(String filename) {
        Integer filePid;

        try {
            filePid = readPIDFromFile(filename);
        } catch (CorruptedPidException e) {
            log.error("PID number is corrupted", e);
            return;
        }

        if (filePid != null) {
            String PID = String.valueOf(filePid);
            if (PID.equals(getCurrentPid())) {
                log.info("Pid from File " + filename + " Matches current pid. Deleting the PID.");
                new File(filename).delete();
            } else {
                log.info("Pid: " + filePid + " Does not match current Pid: " + getCurrentPid()
                + " Assuming upgrade, Not deleting pid file:" + filename);
            }
        }
    }
