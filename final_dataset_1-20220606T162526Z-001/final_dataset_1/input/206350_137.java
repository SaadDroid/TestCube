public void createDataNode(DataNodeDescriptor node) {
        DataChannelDescriptor domain = (DataChannelDescriptor) getProjectController().getProject().getRootNode();
        domain.getNodeDescriptors().add(node);
        getProjectController().fireDataNodeEvent(new DataNodeEvent(this, node, MapEvent.ADD));
        getProjectController().fireDataNodeDisplayEvent(new DataNodeDisplayEvent(this, domain, node));
    }
