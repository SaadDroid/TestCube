public ResultHandler<String, CoreTokenException> delete(String tokenId) throws CoreTokenException {
        debug("Delete: queued delete {0}", tokenId);
        final ResultHandler<String, CoreTokenException> deleteHandler = handlerFactory.getDeleteHandler();
        dispatcher.delete(tokenId, deleteHandler);
        return deleteHandler;
    }
