@Override
  public MimeBodyPart select(BodyPartIterator m) throws MessagingException {
    MimeBodyPart result = null;
    assertConfig();
    outer: while (m.hasNext()) {
      MimeBodyPart p = m.next();
      String[] values = p.getHeader(getHeaderName());
      if (values != null) {
        for (String value : values) {
          if (value.matches(getHeaderValueRegExp())) {
            result = p;
            break outer;
          }
        }
      }
    }
    return result;
  }
