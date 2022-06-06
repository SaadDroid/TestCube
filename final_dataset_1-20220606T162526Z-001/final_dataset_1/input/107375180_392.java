@Deprecated
    public TableSection createSection() {
        return (TableSection)new PmoBasedSectionFactory().createSection(containerPmo, bindingContext);
    }
