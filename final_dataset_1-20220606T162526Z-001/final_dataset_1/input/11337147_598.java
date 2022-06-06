public GroupUpdater convert(Map<String, String> attributes, long tenantId) {
        GroupUpdater updater = new GroupUpdater();
        if (attributes.containsKey(GroupItem.ATTRIBUTE_DESCRIPTION)) {
            updater.updateDescription(attributes.get(GroupItem.ATTRIBUTE_DESCRIPTION));
        }
        if (!MapUtil.isBlank(attributes, GroupItem.ATTRIBUTE_ICON)) {
            IconDescriptor iconDescriptor = getBonitaHomeFolderAccessor().getIconFromFileSystem(attributes.get(GroupItem.ATTRIBUTE_ICON), tenantId);
            updater.updateIcon(iconDescriptor.getFilename(), iconDescriptor.getContent());
        }
        if (!MapUtil.isBlank(attributes, GroupItem.ATTRIBUTE_NAME)) {
            updater.updateName(attributes.get(GroupItem.ATTRIBUTE_NAME));
        }
        if (attributes.containsKey(GroupItem.ATTRIBUTE_DISPLAY_NAME)) {
            updater.updateDisplayName(attributes.get(GroupItem.ATTRIBUTE_DISPLAY_NAME));
        }
        if (attributes.containsKey(GroupItem.ATTRIBUTE_PARENT_GROUP_ID)) {
            String parentGroupPath = getParentGroupPath(attributes.get(GroupItem.ATTRIBUTE_PARENT_GROUP_ID));
            updater.updateParentPath(parentGroupPath);
        }
        return updater;
    }
