@Override
    public boolean marathon_select(String value) {
        DatePicker datePicker = (DatePicker) getComponent();
        if (!value.equals("")) {
            try {
                LocalDate date = datePicker.getConverter().fromString(value);
                datePicker.setValue(date);
            } catch (Throwable t) {
                throw new DateTimeException("Invalid value for '" + value + "' for date-picker '");
            }
            return true;
        }
        return false;
    }
