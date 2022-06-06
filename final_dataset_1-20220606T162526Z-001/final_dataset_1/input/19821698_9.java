@Override
    public <T> AgEntity<T> getAgEntity(Class<T> type) {
        if (type == null) {
            throw new NullPointerException("Null type");
        }

        AgEntity<T> e = dataMap.getEntity(type);

        if (e == null) {
            throw new AgException(Status.BAD_REQUEST, "Invalid entity: " + type.getName());
        }

        return e;
    }
