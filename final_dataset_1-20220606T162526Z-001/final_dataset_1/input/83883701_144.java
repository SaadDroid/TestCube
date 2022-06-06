@Override
    public void focusLost(RFXComponent next) {
        DatePicker datePicker = (DatePicker) node;
        LocalDate value = datePicker.getValue();
        String currentDate;
        if (value == null && datePicker.isEditable()) {
            currentDate = datePicker.getEditor().getText();
        } else {
            currentDate = getDatePickerText(datePicker, value);
        }
        if (!currentDate.equals(prevDate))
            recorder.recordSelect(this, currentDate);
    }
