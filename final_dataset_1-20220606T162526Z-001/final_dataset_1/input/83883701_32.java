@Override
    public boolean marathon_select(String value) {
        SplitPane splitPane = (SplitPane) getComponent();
        JSONArray locations = new JSONArray(value);
        double[] dividerLocations = new double[locations.length()];
        for (int i = 0; i < locations.length(); i++) {
            dividerLocations[i] = locations.getDouble(i);
        }
        splitPane.setDividerPositions(dividerLocations);
        return true;
    }
