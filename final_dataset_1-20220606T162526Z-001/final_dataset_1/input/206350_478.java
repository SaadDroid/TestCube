@SuppressWarnings("unchecked")
    public ColumnSelect<Object[]> columns(Property<?>... properties) {
        if (properties.length == 0) {
            throw new IllegalArgumentException("properties must contain at least one element");
        }
        if (columns == null) {
            columns = new ArrayList<>(properties.length);
        }
        Collections.addAll(columns, properties);
        singleColumn = false;
        return (ColumnSelect<Object[]>)this;
    }
