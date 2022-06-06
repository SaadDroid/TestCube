public void updateLink(Link link)
    {
        refreshClientData();

        if (clientData != null) link.addParameter(PARAMETER_NAME, clientData);
    }
