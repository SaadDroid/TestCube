public static BodyPartIterator createBodyPartIterator(AdaptrisMessage msg) throws IOException, MessagingException {
    BodyPartIterator result = null;
    try (InputStream in = msg.getInputStream()) {
      result = new BodyPartIterator(in);
    } catch (Exception e) {
      String mimeBoundary = getBoundary(msg);
      result = createBodyPartIterator(mimeFaker(msg, mimeBoundary));
    }
    if (result == null) {
      throw new IOException("Could not parse " + msg.getUniqueId() + " into a standard MIME Multipart");
    }
    return result;
  }
