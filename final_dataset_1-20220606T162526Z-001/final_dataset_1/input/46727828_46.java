String constructFieldName(String fileType, int column, String header) {
    // chose 5 zero's because Excel 2010 supports up to 16384 columns
    return String.format("%s_%05d_%s", fileType, column, header);
  }
