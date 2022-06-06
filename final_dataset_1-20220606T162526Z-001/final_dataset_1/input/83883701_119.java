@Override
    public void focusLost(RFXComponent next) {
        Spinner<?> spinner = (Spinner<?>) node;
        String currentValue = getSpinnerText(spinner);
        if (!currentValue.equals(oldValue)) {
            recorder.recordSelect(this, currentValue);
        }
    }
