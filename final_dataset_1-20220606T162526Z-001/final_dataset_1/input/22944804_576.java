public RequestingPartyToken readRPT(String id) throws NotFoundException {
        return (RequestingPartyToken) readToken(id, rptAdapter);
    }
