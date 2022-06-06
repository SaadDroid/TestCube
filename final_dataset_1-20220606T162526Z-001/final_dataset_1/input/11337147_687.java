@Override
    public Serializable toClientObject(Serializable object) {
        return BusinessDataReferenceResource.toClient((BusinessDataReference) object);
    }
