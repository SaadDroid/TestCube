@Override
    public boolean marathon_select(String value) {
        HTMLEditor htmlEditor = (HTMLEditor) getComponent();
        htmlEditor.setHtmlText(value);
        return true;
    }
