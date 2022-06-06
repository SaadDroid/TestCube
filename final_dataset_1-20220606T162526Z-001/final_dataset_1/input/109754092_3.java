@Override
  public AuditReplayCommand parse(Text inputLine, Function<Long, Long> relativeToAbsolute) throws IOException {
    Matcher m = MESSAGE_ONLY_PATTERN.matcher(inputLine.toString());
    if (!m.find()) {
      throw new IOException("Unable to find valid message pattern from audit log line: " + inputLine);
    }
    long relativeTimestamp;
    try {
      relativeTimestamp = AUDIT_DATE_FORMAT.parse(m.group(1)).getTime() - startTimestamp;
    } catch (ParseException p) {
      throw new IOException("Exception while parsing timestamp from audit log", p);
    }
    // We sanitize the = in the rename options field into a : so we can split on =
    String auditMessageSanitized = m.group(2).replace("(options=", "(options:");
    Map<String, String> parameterMap = AUDIT_SPLITTER.split(auditMessageSanitized);
    return new AuditReplayCommand(relativeToAbsolute.apply(relativeTimestamp),
        // Split the UGI on space to remove the auth and proxy portions of it
        SPACE_SPLITTER.split(parameterMap.get("ugi")).iterator().next(),
        parameterMap.get("cmd").replace("(options:", "(options="),
        parameterMap.get("src"), parameterMap.get("dst"), parameterMap.get("ip"));
  }
