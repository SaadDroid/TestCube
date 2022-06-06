@Override
    public boolean marathon_select(String value) {
        boolean selected = Boolean.parseBoolean(value);
        boolean current = ((ToggleButton) node).isSelected();
        if (selected != current) {
            click();
        }
        return true;
    }
