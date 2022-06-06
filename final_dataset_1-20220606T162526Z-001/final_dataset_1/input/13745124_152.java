@NullableDecl
  public DirectoryEntry get(Name name) {
    int index = bucketIndex(name, table.length);

    DirectoryEntry entry = table[index];
    while (entry != null) {
      if (name.equals(entry.name())) {
        return entry;
      }

      entry = entry.next;
    }
    return null;
  }
