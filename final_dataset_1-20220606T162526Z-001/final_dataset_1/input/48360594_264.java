@Override
    public boolean canHandle(ActionParameter actionParameter) {
        if (!(actionParameter.getInputData() instanceof String)) {
            return false;
        }
        return actionParameter.getDataset().isShortest(actionParameter.getInputData(), actionParameter.getColumn(),
                actionParameter.isIgnoreBlanks());
    }
