public BindingFaultFactory getBindingFaultFactory(Binding binding) {
        return new SoapFaultFactory(binding);
    }
