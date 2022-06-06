public List<String> getActivationTypes() {
        HashSet<String> types = new HashSet<String>();
        CompositeModel composite = getConfig().getComposite();
        if (composite != null) {
            // reference bindings
            for (CompositeReferenceModel reference : composite.getReferences()) {
                for (BindingModel binding : reference.getBindings()) {
                    types.add(binding.getType());
                }
            }
            // service bindings
            for (CompositeServiceModel service : composite.getServices()) {
                for (BindingModel binding : service.getBindings()) {
                    types.add(binding.getType());
                }
            }
            // implementations
            for (ComponentModel component : composite.getComponents()) {
                if (component.getImplementation() != null) {
                    types.add(component.getImplementation().getType());
                }
            }
        }
        
        return new ArrayList<String>(types);
    }
