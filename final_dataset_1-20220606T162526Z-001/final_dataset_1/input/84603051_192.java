@Override
    public void suspendDiscovery() throws HekateException {
        liveProviders.forEach(provider -> {
            try {
                provider.suspendDiscovery();
            } catch (Throwable e) {
                if (log.isWarnEnabled()) {
                    log.warn("Failed to suspend discovery [provider={}]", provider, e);
                }
            }
        });
    }
