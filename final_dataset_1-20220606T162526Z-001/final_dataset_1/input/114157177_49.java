public boolean eval(DataFile file) {
    // TODO: detect the case where a column is missing from the file using file's max field id.
    return visitor().eval(file);
  }
