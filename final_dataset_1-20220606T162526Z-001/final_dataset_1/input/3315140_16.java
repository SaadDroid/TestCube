@VisibleForTesting
    void deleteConfigurationFiles() {
        try {
            // delete config files (separate config files for each node are generated)
            sshClient.executeAndSysout("rm -rf " + JPPF_NODE_DIR + "/config/jppf-node-*.properties");
        } catch (SSHClientException ex) {
            logger.warn("Exception while deleting (old) configuration files.", ex);
        }
    }
