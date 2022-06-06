public void addHeaderButton(Button button) {
        button.addStyleName(LinkkiTheme.BUTTON_TEXT);
        headerComponents.add(button);
        header.addComponent(button, 1);
        updateHeader();
    }
