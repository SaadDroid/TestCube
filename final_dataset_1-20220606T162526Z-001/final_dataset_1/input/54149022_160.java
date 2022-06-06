@RolesAllowed(UserGroupMapping.REGULAR_USER_ROLE_ID)
    @Override
    public void removeACLFromWorkflow(String pWorkspaceId, String workflowModelId) throws UserNotFoundException, UserNotActiveException, WorkspaceNotFoundException, WorkflowModelNotFoundException, AccessRightException, WorkspaceNotEnabledException {
        // Check the read access to the workspace
        User user = userManager.checkWorkspaceReadAccess(pWorkspaceId);
        // Load the workflowModel
        WorkflowModelKey workflowModelKey = new WorkflowModelKey(pWorkspaceId, workflowModelId);
        WorkflowModel workflowModel = workflowModelDAO.loadWorkflowModel(workflowModelKey);
        // Check the access to the workflow
        checkWorkflowWriteAccess(workflowModel, user);

        ACL acl = workflowModel.getAcl();
        if (acl != null) {
            aclDAO.removeACLEntries(acl);
            workflowModel.setAcl(null);
        }
    }
