@RolesAllowed(UserGroupMapping.REGULAR_USER_ROLE_ID)
    @Override
    public BinaryResource saveFileInDocument(DocumentIterationKey pDocPK, String pName, long pSize) throws WorkspaceNotFoundException, NotAllowedException, DocumentRevisionNotFoundException, FileAlreadyExistsException, UserNotFoundException, UserNotActiveException, CreationException, AccessRightException, WorkspaceNotEnabledException {
        User user = checkDocumentRevisionWriteAccess(new DocumentRevisionKey(pDocPK.getWorkspaceId(), pDocPK.getDocumentMasterId(), pDocPK.getDocumentRevisionVersion()));

        checkNameFileValidity(pName);

        DocumentRevision docR = documentRevisionDAO.loadDocR(new DocumentRevisionKey(pDocPK.getWorkspaceId(), pDocPK.getDocumentMasterId(), pDocPK.getDocumentRevisionVersion()));
        DocumentIteration document = docR.getIteration(pDocPK.getIteration());

        if (isCheckoutByUser(user, docR) && docR.getLastIteration().equals(document)) {
            BinaryResource binaryResource = null;

            String fullName = docR.getWorkspaceId() + "/documents/" + docR.getId() + "/" + docR.getVersion() + "/" + document.getIteration() + "/" + pName;

            for (BinaryResource bin : document.getAttachedFiles()) {
                if (bin.getFullName().equals(fullName)) {
                    binaryResource = bin;
                    break;
                }
            }
            if (binaryResource == null) {
                binaryResource = new BinaryResource(fullName, pSize, new Date());
                binaryResourceDAO.createBinaryResource(binaryResource);
                document.addFile(binaryResource);
            } else {
                binaryResource.setContentLength(pSize);
                binaryResource.setLastModified(new Date());
            }
            return binaryResource;
        } else {
            throw new NotAllowedException("NotAllowedException4");
        }
    }
