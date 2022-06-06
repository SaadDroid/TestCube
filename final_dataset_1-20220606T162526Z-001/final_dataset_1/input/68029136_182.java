public boolean canPropertyValueBeSetOnContext(PropertyDescriptorEntity property, ContextDependency<?> contextDependency){

        if(isHostNameProperty(property) && isDefinedOnNode(contextDependency)){
            return contextDependency.getContext().isEnvironment();
        }
        return true;
    }
