@Override
    protected void add(ServiceFunctionClassifier serviceFunctionClassifier) {
        if (serviceFunctionClassifier != null) {
            LOG.debug("Adding Service Function Classifier: {}", serviceFunctionClassifier.getName());

            // TODO: literally copied from the existing code. It should be
            // optimized.
            if (serviceFunctionClassifier.getName() != null && serviceFunctionClassifier.getAcl() != null) {
                // call executor to write <ACL, Classifier> entry into ACL
                // operational store
                SfcProviderAclAPI.addClassifierToAccessListState(serviceFunctionClassifier.getAcl().getName(),
                        serviceFunctionClassifier.getAcl().getType(), serviceFunctionClassifier.getName());
            }
        }
    }
