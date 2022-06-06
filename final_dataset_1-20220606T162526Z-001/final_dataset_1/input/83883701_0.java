@Override
    public boolean marathon_select(String value) {
        JideSplitPane splitPane = (JideSplitPane) getComponent();
        JSONArray locations = new JSONArray(value);
        int[] dividerLocations = new int[locations.length()];
        for (int i = 0; i < locations.length(); i++) {
            dividerLocations[i] = locations.getInt(i);
        }
        splitPane.setDividerLocations(dividerLocations);
        return true;
    }
