@Override
    public DeleteResult delete(Document doc) {
        return deleteWithin(doc, -1);
    }
