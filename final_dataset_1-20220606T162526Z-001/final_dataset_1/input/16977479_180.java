public ProcessedClaimCollection mapClaims(String sourceRealm, ProcessedClaimCollection sourceClaims,
        String targetRealm, ClaimsParameters parameters) {
        JexlContext context = new MapContext();
        context.set("sourceClaims", sourceClaims);
        context.set("targetClaims", new ProcessedClaimCollection());
        context.set("sourceRealm", sourceRealm);
        context.set("targetRealm", targetRealm);
        context.set("claimsParameters", parameters);

        JexlScript s = getScript();
        if (s == null) {
            LOG.warning("No claim mapping script defined");
            return new ProcessedClaimCollection(); // TODO Check if null or an exception would be more
                                                   // appropriate
        }
        return (ProcessedClaimCollection)s.execute(context);
    }
