@Nullable
  public static String traceId(TraceContext context) {
    for (int i = 0, length = context.extra().size(); i < length; i++) {
      Object next = context.extra().get(i);
      if (next instanceof AmznTraceId) {
        char[] result = new char[ROOT_LENGTH];
        writeRoot(context, result, 0);
        return new String(result);
      }
    }
    // See if we have the field as a pass-through
    String maybeHeader = FIELD_AMZN_TRACE_ID.getValue(context);
    if (maybeHeader == null) return null;
    int i = maybeHeader.indexOf("Root=");
    if (i == -1) return null;
    i += 5; // Root=
    if (maybeHeader.length() < i + ROOT_LENGTH) return null;
    return maybeHeader.substring(i, i + ROOT_LENGTH);
  }
