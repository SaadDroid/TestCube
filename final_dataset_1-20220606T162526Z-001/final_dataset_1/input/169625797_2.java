public static DialogType getDialogType(Node node) throws RepositoryException {
        DialogType type = DialogType.UNKNOWN;

        if (node == null) {
            return type;
        }

        String name = node.getName();

        if (Arrays.asList(CLASSIC_DIALOG_NAMES).contains(name) && NT_DIALOG.equals(node.getPrimaryNodeType().getName())) {
            type = DialogType.CLASSIC;
        } else if (Arrays.asList(DIALOG_NAMES).contains(name) && node.hasNode("content")) {
            Node contentNode = node.getNode("content");
            type = DialogType.CORAL_2;

            if (contentNode != null) {
                if (contentNode.hasProperty(ResourceResolver.PROPERTY_RESOURCE_TYPE)) {
                    String resourceType = contentNode.getProperty(ResourceResolver.PROPERTY_RESOURCE_TYPE).getString();
                    type = resourceType.startsWith(DIALOG_CONTENT_RESOURCETYPE_PREFIX_CORAL3) ? DialogType.CORAL_3 : DialogType.CORAL_2;
                }
            }
        }

        return type;
    }
