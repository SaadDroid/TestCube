public void setPsMultiPulseNumbers(@PsMultiPulseNumbers int multiPulseNumbers)
            throws IOException, IllegalStateException {
        setPsConf3Ms(PS_MULTI_PULSE_MASK, multiPulseNumbers);
    }
