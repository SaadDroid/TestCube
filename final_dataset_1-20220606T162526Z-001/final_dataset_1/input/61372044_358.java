@Override
    @DB
    @ActionEvent(eventType = EventTypes.EVENT_AFFINITY_GROUP_DELETE, eventDescription = "Deleting affinity group")
    public boolean deleteAffinityGroup(final Long affinityGroupId, final String account, final Long projectId, final Long domainId, final String affinityGroupName) {

        final AffinityGroupVO group = getAffinityGroup(affinityGroupId, account, projectId, domainId, affinityGroupName);

        // check permissions
        final Account caller = CallContext.current().getCallingAccount();
        _accountMgr.checkAccess(caller, AccessType.OperateEntry, true, group);

        final Long affinityGroupIdFinal = group.getId();
        deleteAffinityGroup(affinityGroupIdFinal);

        // remove its related ACL permission
        final Pair<Class<?>, Long> params = new Pair<>(AffinityGroup.class, affinityGroupIdFinal);
        _messageBus.publish(_name, EntityManager.MESSAGE_REMOVE_ENTITY_EVENT, PublishScope.LOCAL, params);

        if (s_logger.isDebugEnabled()) {
            s_logger.debug("Deleted affinity group id=" + affinityGroupIdFinal);
        }
        return true;
    }
