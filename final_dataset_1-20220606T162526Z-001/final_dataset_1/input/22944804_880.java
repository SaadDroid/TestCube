public T read(String id) throws NotFoundException, ServerException {
        try {
            if (id == null) {
                throw new NotFoundException("Object not found");
            }
            SyncResultHandler<Token> handler = new SyncResultHandler<Token>();
            taskExecutor.execute(id, taskFactory.read(id, handler));
            Token token = handler.getResults();
            if (token == null) {
                throw new NotFoundException("Object not found with id: " + id);
            }
            return adapter.fromToken(token);
        } catch (NotFoundException e) {
            throw e;
        } catch (ServerException e) {
            throw e;
        } catch (DataLayerException e) {
            if (debug.warningEnabled()) {
                debug.warning("Unable to read token corresponding to id: " + id, e);
            }
            throw new ServerException("Could not read token from token data store: " + e.getMessage());
        }
    }
