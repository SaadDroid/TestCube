public String getStringId(ObjectId id) {
        EntityIdCoder coder = getCoder(id.getEntityName());
        return coder.toStringId(id);
    }
