public void removeAcls(Set<Acl> acls, Resource resource) {
        if (acls == null)
            throw new IllegalArgumentException("acls cannot be null");
        if (resource == null)
            throw new IllegalArgumentException("resource cannot be null");

        LOG.debug("Removing ACLs [{}] for resource [{}]", acls, resource);

        try {
            getAuthorizer().removeAcls(toImmutableScalaSet(acls), resource);
        } catch (ZkException | ZooKeeperClientException e) {
            throw new AdminOperationException("Unable to remove ACLs for resource: " + resource, e);
        }
    }
