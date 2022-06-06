@Override
    public ObjectContext createContext() {
        return createdFromDataDomain(dataDomain);
    }
