public static boolean isStream(COSBase elt, COSDocument doc) {
    if (elt instanceof COSObject) {
      try {
        COSObjectKey key = new COSObjectKey((COSObject) elt);
        COSObject obj = doc.getObjectFromPool(key);
        return (obj != null && obj.getObject() instanceof COSStream);
      } catch (IOException e) {
        return false;
      }
    }

    return (elt instanceof COSStream);
  }
