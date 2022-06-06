public static @CheckForNull
    String geMixinTypes(@Nonnull Node node) throws RepositoryException {
        Object[] mixinTypes = node.hasProperty(JCR_MIXIN_TYPES) ?
                node.getProperty(JCR_MIXIN_TYPES).getValues() :
                node.getMixinNodeTypes();

        if (mixinTypes == null || mixinTypes.length == 0) {
            return null;
        }

        StringBuilder commaSeparatedMixinTypeNames = new StringBuilder(64);

        for (int i = 0; i < mixinTypes.length; ++i) {
            commaSeparatedMixinTypeNames.append(mixinTypes[i].toString());
            if (i < mixinTypes.length - 1) {
                commaSeparatedMixinTypeNames.append(',');
            }
        }

        return commaSeparatedMixinTypeNames.toString();
    }
