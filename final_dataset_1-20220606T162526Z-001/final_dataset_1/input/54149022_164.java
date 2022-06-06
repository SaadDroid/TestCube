@Override
    @RolesAllowed({UserGroupMapping.ADMIN_ROLE_ID, UserGroupMapping.REGULAR_USER_ROLE_ID})
    @TransactionAttribute(value = TransactionAttributeType.REQUIRES_NEW)
    public void createWorkspaceIndex(String workspaceId) throws WorkspaceAlreadyExistsException {
        try {
            if(indexManager.indicesExist(workspaceId)){
                throw new WorkspaceAlreadyExistsException(workspaceId);
            }
            indexManager.createIndices(workspaceId);
        } catch (IndexerNotAvailableException | IndexerRequestException e) {
            LOGGER.log(Level.WARNING, "Cannot create index for workspace [" + workspaceId + "]", e);
        }
    }
