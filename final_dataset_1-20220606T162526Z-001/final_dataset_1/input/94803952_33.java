@Override
    public void execute() throws UpdateExecutionException {
        try {
            sync();
            getMarkLogicClient().sendUpdateQuery(getQueryString(), getBindings(), getIncludeInferred(), getBaseURI());
        }catch(ForbiddenUserException | FailedRequestException e){
            throw new UpdateExecutionException(e);
        } catch (RepositoryException e) {
            throw new UpdateExecutionException(e);
        } catch (MalformedQueryException e) {
            throw new UpdateExecutionException(e);
        } catch (IOException e) {
            throw new UpdateExecutionException(e);
        }
    }
