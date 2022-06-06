@Override
    public Promise<ActionResponse, ResourceException> actionCollection(Context serverContext,
            ActionRequest actionRequest) {
        switch (actionRequest.getAction()) {
            case RecordConstants.START_ACTION:
                return actionStart(actionRequest.getContent());
            case RecordConstants.STATUS_ACTION:
                return actionStatus();
            case RecordConstants.STOP_ACTION:
                return actionStop();
            default:
                return RestUtils.generateUnsupportedOperation();
        }
    }
