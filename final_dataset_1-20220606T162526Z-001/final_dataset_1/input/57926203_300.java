@Override
    public void onDataTreeChanged(@Nonnull Collection<DataTreeModification<RenderedServicePath>> collection) {
        for (DataTreeModification<RenderedServicePath> modification : collection) {
            DataObjectModification<RenderedServicePath> rootNode = modification.getRootNode();

            switch (rootNode.getModificationType()) {
                case WRITE:
                case SUBTREE_MODIFIED:
                    if (rootNode.getDataBefore() == null && rootNode.getDataAfter() != null) {
                        LOG.info("SfcOfRspDataListener.onDataTreeChanged create RSP {}", rootNode.getDataBefore());
                        sfcOfRspProcessor.processRenderedServicePath(rootNode.getDataAfter());
                    } else if (rootNode.getDataAfter().equals(rootNode.getDataBefore())) {
                        LOG.info("SfcOfRspDataListener.onDataTreeChanged update RSP Before:{} After:{}",
                                rootNode.getDataAfter(),
                                rootNode.getDataBefore());
                        // This clause supports re-rendering of unmodified RSPs
                        sfcOfRspProcessor.deleteRenderedServicePath(rootNode.getDataBefore());
                        sfcOfRspProcessor.processRenderedServicePath(rootNode.getDataAfter());
                    }
                    break;
                case DELETE:
                    if (rootNode.getDataBefore() != null) {
                        LOG.info("SfcOfRspDataListener.onDataTreeChanged delete RSP {}", rootNode.getDataBefore());
                        sfcOfRspProcessor.deleteRenderedServicePath(rootNode.getDataBefore());
                    }
                    break;
            }
        }
    }
