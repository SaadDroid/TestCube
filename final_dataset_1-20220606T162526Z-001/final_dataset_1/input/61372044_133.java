protected static void throwSshExceptionIfConditionsTimeout(final int conditions) throws SshException {
        if ((conditions & ChannelCondition.TIMEOUT) != 0) {
            final String msg = "Timed out in waiting for SSH execution exit status";
            s_logger.error(msg);
            throw new SshException(msg);
        }
    }
