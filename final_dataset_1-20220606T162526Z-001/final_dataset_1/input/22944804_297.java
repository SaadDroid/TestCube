public String debugOperationAttemptAsPrincipal(String resource, String operation, Context context,
            String realm, Debug debug) {
        init();
        Reject.ifNull(resource, operation, context, debug);

        final String principalName = PrincipalRestUtils.getPrincipalNameFromServerContext(context);

        StringBuilder sb = new StringBuilder();
        sb.append(resource).append(" :: ").append(operation.toUpperCase());
        sb.append(" attempted by ");
        sb.append(principalName == null ? "[unknown]" : principalName);

        if (realm != null) {
            sb.append(" in realm ").append(realm);
        }

        debug.message(sb.toString());

        return principalName;
    }
