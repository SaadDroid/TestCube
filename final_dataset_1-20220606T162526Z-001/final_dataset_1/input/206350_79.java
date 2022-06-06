@Override
    public EventBridge createEventBridge(
            Collection<EventSubject> localSubjects,
            String externalSubject,
            Map<String, String> properties) {
        return new XMPPBridge(localSubjects, externalSubject, properties);
    }
