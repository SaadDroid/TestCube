@Override
    public void focusLost(RFXComponent next) {
        ComboBox<?> comboBox = (ComboBox<?>) node;
        Object selectedItem = comboBox.getSelectionModel().getSelectedItem();
        if (comboBox.isEditable() && comboBox.getEditor().getText()
                .equals(getComboBoxText(comboBox, comboBox.getItems().indexOf(prevSelectedItem), false))) {
            return;
        } else if (!comboBox.isEditable() && selectedItem != null && selectedItem.equals(prevSelectedItem)) {
            return;
        }
        if (!comboBox.isEditable()) {
            recorder.recordSelect(this, getComboBoxText(comboBox, comboBox.getSelectionModel().getSelectedIndex(), true));
        } else {
            String editorText = comboBox.getEditor().getText();
            String selectedItemText = getComboBoxText(comboBox, comboBox.getSelectionModel().getSelectedIndex(), false);
            if (editorText.equals(selectedItemText)) {
                recorder.recordSelect(this, getComboBoxText(comboBox, comboBox.getSelectionModel().getSelectedIndex(), true));
            } else {
                recorder.recordSelect(this, editorText);
            }
        }
    }
