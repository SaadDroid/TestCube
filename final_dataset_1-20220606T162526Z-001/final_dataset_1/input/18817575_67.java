public static @Nonnull
    String getPrimaryType(@Nonnull Node node) throws RepositoryException {
        return node.hasProperty(JCR_PRIMARY_TYPE) ?
                node.getProperty(JCR_PRIMARY_TYPE).getString() :
                node.getPrimaryNodeType().getName();
    }
