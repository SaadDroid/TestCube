public T getModel(ContentToModelMappingCallback<T> callback) {
        return this.factory.provideModel(this.modelDefinition, callback);
    }
