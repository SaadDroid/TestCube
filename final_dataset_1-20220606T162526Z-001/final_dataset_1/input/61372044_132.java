protected static boolean canEndTheSshConnection(final int waitResultTimeoutInMs, final com.trilead.ssh2.Session sess, final int conditions) throws SshException {
        if (isChannelConditionEof(conditions)) {
            final int newConditions = sess.waitForCondition(ChannelCondition.EXIT_STATUS, waitResultTimeoutInMs);
            throwSshExceptionIfConditionsTimeout(newConditions);
            if ((newConditions & ChannelCondition.EXIT_STATUS) != 0) {
                return true;
            }
        }
        return false;
    }
