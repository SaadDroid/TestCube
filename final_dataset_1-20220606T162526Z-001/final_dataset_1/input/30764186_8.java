@Restricted(DoNotUse.class)
    @RequirePOST
    public FormValidation doCheckAvailabilityZone(
            @QueryParameter String value,
            @RelativePath("../../slaveOptions") @QueryParameter("availabilityZone") String def,
            // authentication fields can be in two places relative to us.
            @RelativePath("..") @QueryParameter("endPointUrl") String endPointUrlCloud,
            @RelativePath("..") @QueryParameter("ignoreSsl") boolean ignoreSsl,
            @RelativePath("../..") @QueryParameter("endPointUrl") String endPointUrlTemplate,
            @RelativePath("..") @QueryParameter("credentialsId") String credentialsIdCloud,
            @RelativePath("../..") @QueryParameter("credentialsId") String credentialsIdTemplate,
            @RelativePath("..") @QueryParameter("zone") String zoneCloud,
            @RelativePath("../..") @QueryParameter("zone") String zoneTemplate
    ) {
        Jenkins.get().checkPermission(Jenkins.ADMINISTER);
        // Warn user if they've not selected anything AND there's multiple availability zones
        // as this can lead to non-deterministic behavior.
        // But if we can't find any availability zones then we assume that all is OK
        // because not all OpenStack deployments support them.
        if (Util.fixEmpty(value) == null) {
            final String d = getDefault(def, opts().getAvailabilityZone());
            if (d != null) return FormValidation.ok(def(d));
            final String endPointUrl = getDefault(endPointUrlCloud,endPointUrlTemplate);
            final String credentialsId = getDefault(credentialsIdCloud,credentialsIdTemplate);
            final OpenstackCredential openstackCredential = OpenstackCredentials.getCredential(credentialsId);
            final String zone = getDefault(zoneCloud, zoneTemplate);
            if (haveAuthDetails(endPointUrl, openstackCredential, zone)) {
                try {
                    final Openstack openstack = Openstack.Factory.get(endPointUrl, ignoreSsl, openstackCredential, zone);
                    final int numberOfAZs = openstack.getAvailabilityZones().size();
                    if (numberOfAZs > 1) {
                        return FormValidation.warning("Ambiguity warning: Multiple zones found.");
                    }
                } catch (AuthenticationException | FormValidation | ConnectionException ex) {
                    LOGGER.log(Level.FINEST, "Openstack call failed", ex);
                } catch (Exception ex) {
                    LOGGER.log(Level.SEVERE, ex.getMessage(), ex);
                }
            }
        }
        return OK;
    }
