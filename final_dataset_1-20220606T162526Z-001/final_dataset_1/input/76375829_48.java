public void enableAlsInterrupt(boolean enable)
            throws IOException, IllegalStateException {
        setAlsConfiguration(ALS_INT_MASK, (enable) ? ALS_INT_ENABLE : ALS_INT_DISABLE);
    }
