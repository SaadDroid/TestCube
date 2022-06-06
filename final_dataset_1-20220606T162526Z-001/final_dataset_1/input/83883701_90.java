@Override
    public void focusLost(RFXComponent next) {
        ListView<?> listView = (ListView<?>) node;
        String currentCellValue = getListCellValue(listView, index);
        if (currentCellValue != null && !currentCellValue.equals(cellValue)) {
            recorder.recordSelect2(this, currentCellValue, true);
        }
        if ((next == null || getComponent() != next.getComponent())
                && listView.getSelectionModel().getSelectedIndices().size() > 1) {
            String currListText = getListSelectionText(listView);
            if (!currListText.equals(listSelectionText)) {
                recorder.recordSelect(this, currListText);
            }
        }
    }
