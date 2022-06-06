@Override
    public double getHighestHostPowerUsage(eu.ascetic.asceticarchitecture.iaas.energymodeller.types.energyuser.Host host) {
        //This returns the last 200 items and finds the highest energy value possible.
        List<HistoryItem> energyData = client.getHistoryDataFromItem(POWER_KPI_NAME, host.getHostName(), Dictionary.HISTORY_ITEM_FORMAT_FLOAT, 200);
        double highestValue = Double.MIN_VALUE;
        for (HistoryItem historyItem : energyData) {
            double current = Double.parseDouble(historyItem.getValue());
            if (current > highestValue) {
                highestValue = current;
            }
        }
        return highestValue;
    }
