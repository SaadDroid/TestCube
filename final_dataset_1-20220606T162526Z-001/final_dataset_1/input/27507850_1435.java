@Override
  public boolean equals(@Nullable Object other) {
    if (this == other) {
      return true;
    } else if (!(other instanceof FileLines)) {
      return false;
    }
    FileLines o = (FileLines) other;
    return _filename.equals(o._filename) && _lines.equals(o._lines);
  }
