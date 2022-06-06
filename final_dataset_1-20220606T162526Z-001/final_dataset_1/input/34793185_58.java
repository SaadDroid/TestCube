@Override
    public void addRootItem(DataObject rootDataObject) {
        createFieldPickerItemLabel(rootDataObject.getName(),
                                   () -> presenter.onRootLabelRemoved());
    }
