public Token read(String tokenId) throws CoreTokenException {
        debug("Read: queued {0}", tokenId);
        ResultHandler<Token, CoreTokenException> handler = handlerFactory.getReadHandler();
        dispatcher.read(tokenId, handler);

        try {
            Token token = handler.getResults();
            if (token == null) {
                debug("Read: no Token found for {0}", tokenId);
            } else {
                reverseBlobStrategy(token);
                debug("Read: returned for {0}\n{1}", tokenId, token);
            }
            return token;
        } catch (CoreTokenException e) {
            throw new ReadFailedException(tokenId, e);
        }
    }
