protected void select() {
        uiUpdateObserver.ifPresent(UiUpdateObserver::uiUpdated);
        getContent().setVisible(true);
        getButton().addStyleName(LinkkiApplicationTheme.SIDEBAR_SELECTED);
    }
