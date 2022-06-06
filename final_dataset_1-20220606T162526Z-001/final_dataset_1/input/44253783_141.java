@Override
  public Name composeName(Name name, Name prefix) throws NamingException {
    Name composed = (Name) prefix.clone();
    return composed.addAll(name);
  }
