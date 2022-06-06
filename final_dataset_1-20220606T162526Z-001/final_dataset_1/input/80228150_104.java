public <T extends VirtualizationConnectorDto> void checkConnection(DryRunRequest<T> request,  VirtualizationConnector vc) throws Exception {
        if (!request.isSkipAllDryRun()) {
            ErrorTypeException errorTypeException = null;
            final ArrayList<CertificateResolverModel> certificateResolverModels = new ArrayList<>();

            if (this.managerFactory == null) {
                this.managerFactory = X509TrustManagerFactory.getInstance();
            }

            if (vc.getVirtualizationType().equals(VirtualizationType.OPENSTACK)) {
                errorTypeException = checkOpenstackConnection(request, certificateResolverModels, vc);
            } else if (vc.getVirtualizationType().equals(VirtualizationType.KUBERNETES)) {
                errorTypeException = checkKubernetesConnection(request, certificateResolverModels, vc);
            }

            this.managerFactory.clearListener();

            if (!certificateResolverModels.isEmpty() && errorTypeException != null) {
                throw new SslCertificatesExtendedException(errorTypeException, certificateResolverModels);
            } else if (errorTypeException != null) {
                throw errorTypeException;
            }
        }
    }
