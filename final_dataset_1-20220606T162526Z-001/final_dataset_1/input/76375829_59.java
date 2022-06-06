public void enablePsActiveForceMode(boolean enable)
            throws IOException, IllegalStateException {
        setPsConf3Ms(PS_ACTIVE_FORCE_MODE_MASK,
                (enable) ? PS_ACTIVE_FORCE_MODE_ENABLE : PS_ACTIVE_FORCE_MODE_DISABLE);
    }
