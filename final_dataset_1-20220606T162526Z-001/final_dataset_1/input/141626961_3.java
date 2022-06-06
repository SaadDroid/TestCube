@Override
    public boolean isPossibleToCreateNextItem(DateTime currentDate, DateTime executionDate) {
        return getBuildingStrategy().isPossibleToCreateNextItem(currentDate, executionDate);
    }
