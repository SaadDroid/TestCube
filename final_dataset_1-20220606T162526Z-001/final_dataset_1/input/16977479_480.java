@Override
    public Client removeClient(String clientId) {
        Client c = doGetClient(clientId);
        removeClientTokens(c);
        doRemoveClient(c);
        return c;
    }
