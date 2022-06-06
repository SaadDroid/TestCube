public ColumnSelect<T> distinct() {
        metaData.setSuppressingDistinct(false);
        this.distinct = true;
        return this;
    }
