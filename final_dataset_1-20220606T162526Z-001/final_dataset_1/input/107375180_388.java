@SuppressWarnings("deprecation")
    @Override
    public ComponentWrapper createComponent(ContainerPmo<?> containerPmo) {
        com.vaadin.v7.ui.Table table = containerPmo.isHierarchical() ? new com.vaadin.v7.ui.TreeTable()
                : new com.vaadin.v7.ui.Table();
        table.addStyleName(LinkkiTheme.TABLE);
        table.setHeightUndefined();
        table.setWidth("100%");
        table.setSortEnabled(false);
        return new TableComponentWrapper<>(containerPmo.getClass().getSimpleName(), table);
    }
