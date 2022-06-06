@Override
    public boolean canHandle(ActionParameter actionParameter) {
        HashMap<String, Integer> survivorIndexMap = actionParameter.getDataset().getSurvivorIndexMap();
        String refColumn = actionParameter.getColumn();
        Integer survivedValueIndex = survivorIndexMap.get(refColumn);
        if (survivedValueIndex == null) {
            return false;
        }
        Object refSurvivedValue =
                actionParameter.getDataset().getRecordList().get(survivedValueIndex).getAttribute(refColumn).getValue();
        Object inputData = actionParameter.getInputData();
        if (inputData == null && refSurvivedValue == null) {
            return true;
        } else if (inputData != null && refSurvivedValue != null) {
            return inputData.equals(refSurvivedValue);
        }
        return false;
    }
