@Override
  public MimeBodyPart select(BodyPartIterator in) throws MessagingException {
    return in.getBodyPart(getContentId());
  }
