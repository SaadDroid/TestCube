@Restricted(DoNotUse.class)
    @RequirePOST
    public FormValidation doCheckStartTimeout(
            @QueryParameter String value,
            @RelativePath("../../slaveOptions") @QueryParameter("startTimeout") String def
    ) {
        Jenkins.get().checkPermission(Jenkins.ADMINISTER);
        if (Util.fixEmpty(value) == null) {
            String d = getDefault(def, opts().getStartTimeout());
            if (d != null) return FormValidation.ok(def(d));
            return REQUIRED;
        }
        return FormValidation.validatePositiveInteger(value);
    }
