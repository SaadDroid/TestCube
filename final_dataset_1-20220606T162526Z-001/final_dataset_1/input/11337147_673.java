public Group update(long groupId, GroupUpdater groupUpdater) {
        try {
            return groupAPI.updateGroup(groupId, groupUpdater);
        } catch (GroupNotFoundException e) {
            throw new APIException(new _("Can't update group. Group not found"));
        } catch (UpdateException e) {
            throw new APIException(new _("Error when updating group"), e);
        } catch (AlreadyExistsException e) {
            throw new APIException(new _("A group with the name %groupName% already exists",
                new Arg("groupName", groupUpdater.getFields().get(GroupField.NAME))));
        }
    }
