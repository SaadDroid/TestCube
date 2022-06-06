public ObjectSelect<T> limit(int fetchLimit) {
        this.metaData.setFetchLimit(fetchLimit);
        return this;
    }
