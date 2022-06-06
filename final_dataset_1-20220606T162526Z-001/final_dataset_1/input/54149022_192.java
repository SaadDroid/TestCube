@RolesAllowed(UserGroupMapping.REGULAR_USER_ROLE_ID)
    @Override
    public DocumentRevision updateDocument(DocumentIterationKey iKey, String pRevisionNote, List<InstanceAttribute> pAttributes, DocumentRevisionKey[] pLinkKeys, String[] documentLinkComments) throws WorkspaceNotFoundException, NotAllowedException, DocumentRevisionNotFoundException, AccessRightException, UserNotFoundException, UserNotActiveException, WorkspaceNotEnabledException {
        DocumentRevisionKey rKey = new DocumentRevisionKey(iKey.getWorkspaceId(), iKey.getDocumentMasterId(), iKey.getDocumentRevisionVersion());
        User user = checkDocumentRevisionWriteAccess(rKey);

        DocumentRevision docR = documentRevisionDAO.loadDocR(rKey);
        //check access rights on docR ?
        if (isCheckoutByUser(user, docR) && docR.getLastIteration().getKey().equals(iKey)) {
            DocumentIteration doc = docR.getLastIteration();

            if (pLinkKeys != null) {
                Set<DocumentLink> currentLinks = new HashSet<>(doc.getLinkedDocuments());

                for (DocumentLink link : currentLinks) {
                    doc.getLinkedDocuments().remove(link);
                }

                int counter = 0;
                for (DocumentRevisionKey link : pLinkKeys) {
                    if (!link.equals(iKey.getDocumentRevision())) {
                        DocumentLink newLink = new DocumentLink(documentRevisionDAO.loadDocR(link));
                        newLink.setComment(documentLinkComments[counter]);
                        documentLinkDAO.createLink(newLink);
                        doc.getLinkedDocuments().add(newLink);
                        counter++;
                    }
                }
            }

            if (pAttributes != null) {
                List<InstanceAttribute> currentAttrs = doc.getInstanceAttributes();
                boolean valid = AttributesConsistencyUtils.hasValidChange(pAttributes, docR.isAttributesLocked(), currentAttrs);
                if (!valid) {
                    throw new NotAllowedException("NotAllowedException59");
                }
                doc.setInstanceAttributes(pAttributes);
            }

            doc.setRevisionNote(pRevisionNote);
            Date now = new Date();
            doc.setModificationDate(now);
            //doc.setLinkedDocuments(links);
            return docR;

        } else {
            throw new NotAllowedException("NotAllowedException25");
        }

    }
