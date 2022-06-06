public void setNewValue(TerminationConfigOption terminationConfigOption) {
        TerminationManager operation = terminationManagerMap.get(terminationConfigOption);
        if (operation != null) {
            operation.setNewValue();
        }
    }
