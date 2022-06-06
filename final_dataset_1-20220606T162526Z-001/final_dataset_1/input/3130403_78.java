public static PmMessage addMessage(PmObject pm, Severity severity, String key, Object... resArgs) {
    PmMessage msg = new PmMessage(pm, severity, key, resArgs);
    pm.getPmConversation().addPmMessage(msg);
    return msg;
  }
