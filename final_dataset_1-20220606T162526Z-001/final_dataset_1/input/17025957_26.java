@Override
    public void processRow(Row currentRow) {
        this.unmappedFields = new HashMap<>();
        Object targetObject = convert(this.target, currentRow);
        if (currentRow.hasChildren() && this.childrenType != null) {
            mapChildren(targetObject, currentRow.getChildren());
        }
        this.consumer.accept(targetObject);
        if (!this.unmappedFields.isEmpty() && this.devNullConsumer != null) {
            this.devNullConsumer.accept(unmappedFields);
        }
    }
