@Override
    public Promise<ResourceResponse, ResourceException> filterUpdate(Context context, UpdateRequest request,
            RequestHandler next) {

        CrestAuditor auditor = newAuditor(context, request);
        auditor.auditAccessAttempt();

        return auditResponse(next.handleUpdate(context, request), auditor, request);
    }
