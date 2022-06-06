@RolesAllowed(UserGroupMapping.REGULAR_USER_ROLE_ID)
    @Override
    public void removeACLFromDocumentRevision(DocumentRevisionKey documentRevisionKey) throws UserNotFoundException, UserNotActiveException, WorkspaceNotFoundException, DocumentRevisionNotFoundException, AccessRightException, WorkspaceNotEnabledException {
        User user = userManager.checkWorkspaceReadAccess(documentRevisionKey.getDocumentMaster().getWorkspace());


        DocumentRevision docR = documentRevisionDAO.getDocRRef(documentRevisionKey);

        if (user.isAdministrator() || isAuthor(user, docR)) {
            ACL acl = docR.getACL();
            if (acl != null) {
                aclDAO.removeACLEntries(acl);
                docR.setACL(null);
            }
        } else {
            throw new AccessRightException(user);
        }
    }
