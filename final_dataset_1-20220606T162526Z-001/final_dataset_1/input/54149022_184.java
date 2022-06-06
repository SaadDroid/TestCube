@RolesAllowed(UserGroupMapping.REGULAR_USER_ROLE_ID)
    @Override
    public PartRevision saveTags(PartRevisionKey revisionKey, String[] pTags) throws UserNotFoundException, WorkspaceNotFoundException, UserNotActiveException, PartRevisionNotFoundException, AccessRightException, WorkspaceNotEnabledException {

        User user = checkPartRevisionWriteAccess(revisionKey);

        PartRevision partRevision = partRevisionDAO.loadPartR(revisionKey);

        Set<Tag> tags = new HashSet<>();
        if (pTags != null) {
            for (String label : pTags) {
                tags.add(new Tag(user.getWorkspace(), label));
            }

            List<Tag> existingTags = Arrays.asList(tagDAO.findAllTags(user.getWorkspaceId()));

            Set<Tag> tagsToCreate = new HashSet<>(tags);
            tagsToCreate.removeAll(existingTags);

            for (Tag t : tagsToCreate) {
                try {
                    tagDAO.createTag(t);
                } catch (CreationException | TagAlreadyExistsException ex) {
                    LOGGER.log(Level.SEVERE, null, ex);
                }
            }

            Set<Tag> removedTags = new HashSet<>(partRevision.getTags());
            removedTags.removeAll(tags);

            Set<Tag> addedTags = partRevision.setTags(tags);

            for (Tag tag : removedTags) {
                tagEvent.select(new AnnotationLiteral<Untagged>() {
                }).fire(new TagEvent(tag, partRevision));
            }
            for (Tag tag : addedTags) {
                tagEvent.select(new AnnotationLiteral<Tagged>() {
                }).fire(new TagEvent(tag, partRevision));
            }

            if (isCheckoutByAnotherUser(user, partRevision)) {
                em.detach(partRevision);
                partRevision.removeLastIteration();
            }

            partRevision.getPartIterations().forEach(indexerManager::indexPartIteration);

        } else {
            throw new IllegalArgumentException("pTags argument must not be null");
        }

        return partRevision;

    }
