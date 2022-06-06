public void setPsOutputResolution(@PsOutputResolution int outputResolution)
            throws IOException, IllegalStateException {
        setPsConf12(PS_OUT_RES_MASK, outputResolution);
        updateLocalPsConfiguration();
    }
