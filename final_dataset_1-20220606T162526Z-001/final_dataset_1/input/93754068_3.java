public Document createDoc(String id) {
        return new DocumentImpl(id, this.type);
    }
