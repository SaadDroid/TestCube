public void setNodeEnabledForTestGeneration(){
        if(nodeProperties == null){
            nodeProperties = new AmwResourceTemplateModel();
        }
        nodeProperties.put(NODE_ACTIVE, new FreeMarkerProperty("true", NODE_ACTIVE));
    }
