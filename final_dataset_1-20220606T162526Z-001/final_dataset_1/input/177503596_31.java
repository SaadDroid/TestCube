@Override
    public List<Event> findEvents(UUID tenantId, EntityId entityId, TimePageLink pageLink) {
        return findEvents(tenantId, entityId, null, pageLink);
    }
