public static Event create(String name) throws CoreException {
    try {
      Event result = (Event) Class.forName(name).newInstance();
      result.setUniqueId(uidGenerator.create(result));
      result.setCreationTime(System.currentTimeMillis());
      return result;
    }
    catch (Exception e) {
      throw new CoreException(e);
    }
  }
