@Override
    public boolean canHandle(ActionParameter actionParameter) {
        if (!(actionParameter.getInputData() instanceof Date)) {
            return false;
        }
        return actionParameter.getDataset().isLatest(actionParameter.getInputData(), actionParameter.getColumn());
    }
