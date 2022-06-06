@Override
    public void onDataChanged(AsyncDataChangeEvent<InstanceIdentifier<?>, DataObject> change) {
        // SFC OF Renderer config create
        for (Entry<InstanceIdentifier<?>, DataObject> entry : change.getCreatedData().entrySet()) {
            if (entry.getValue() instanceof SfcOfRendererConfig) {
                LOG.info("SfcOfRendererDataListener.onDataChanged create SFC OF Renderer config {}",
                        ((SfcOfRendererConfig) entry.getValue()));
                processConfig((SfcOfRendererConfig) entry.getValue());
            }
        }

        // SFC OF Renderer config update
        for (Entry<InstanceIdentifier<?>, DataObject> entry : change.getUpdatedData().entrySet()) {
            if (entry.getValue() instanceof SfcOfRendererConfig) {
                LOG.info("SfcOfRendererDataListener.onDataChanged update SFC OF Renderer config {}",
                        ((SfcOfRendererConfig) entry.getValue()));
                processConfig((SfcOfRendererConfig) entry.getValue());
            }
        }

        // Not interested in deleted data
    }
