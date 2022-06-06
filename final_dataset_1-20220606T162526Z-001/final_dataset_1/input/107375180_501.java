@Override
    public Button newComponent() {
        Button button = ComponentFactory.newButton();
        if (buttonAnnotation.showIcon()) {
            button.setIcon(buttonAnnotation.icon());
        }
        for (String styleName : buttonAnnotation.styleNames()) {
            button.addStyleName(styleName);
        }
        if (buttonAnnotation.shortcutKeyCode() != -1) {
            button.setClickShortcut(buttonAnnotation.shortcutKeyCode(), buttonAnnotation.shortcutModifierKeys());
        }
        return button;
    }
