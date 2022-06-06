@Override
  public MimeBodyPart select(BodyPartIterator m) throws MessagingException {
    return m.getBodyPart(getPosition());
  }
