public static Vcs extractVcs(File workingDir, Log log) throws IOException {
        log.debug("Extracting Vcs details from the .git directory.");
        File dotGit = getDotGit(workingDir);
        if (dotGit == null) {
            log.debug("Could not find the .git directory.");
            return new Vcs();
        }
        Vcs vcs = new Vcs();
        vcs.setRevision(extractVcsRevision(dotGit, log));
        vcs.setUrl(extractVcsUrl(dotGit, log));
        return vcs;
    }
