@Override
    public boolean marathon_select(String value) {
        ((Slider) node).setValue(Double.valueOf(Double.parseDouble(value)));
        return true;
    }
