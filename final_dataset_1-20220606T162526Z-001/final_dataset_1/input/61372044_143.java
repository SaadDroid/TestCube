protected static boolean isChannelConditionEof(final int conditions) {
        if ((conditions & ChannelCondition.EOF) != 0) {
            return true;
        }
        return false;
    }
