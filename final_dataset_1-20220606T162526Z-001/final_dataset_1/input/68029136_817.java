protected boolean isAuditViewEntryRelevant(AuditViewEntry entry, Map<Integer, AuditViewEntry> allAuditViewEntries) {
        if (entry == null) {
            return false;
        }
        if (entry.getMode() == ADD || entry.getMode() == DEL) {
            return true;
        }
        if (allAuditViewEntries.get(entry.hashCode()) != null) {
            return false;
        }
        if (entry.getType().equals(Auditable.TYPE_TEMPLATE_DESCRIPTOR)) {
            // the content of the template descriptors are ignored
            return true;
        }
        if (entry.isObfuscatedValue()) {
            return true;
        }
        return !StringUtils.equals(entry.getOldValue(), entry.getValue());
    }
