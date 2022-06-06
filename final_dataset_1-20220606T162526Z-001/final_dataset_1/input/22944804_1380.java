@Override
    public void tryPublish(String topic, AuditEvent auditEvent) {
        try {
            String realm = getValue(auditEvent.getValue(), EVENT_REALM, null);
            if (isBlank(realm)) {
                publishToDefault(topic, auditEvent);
            } else {
                publishForRealm(realm, topic, auditEvent);
            }
        } catch (Exception e) {
            logException(e, topic, auditEvent);
        }
    }
