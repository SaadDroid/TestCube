public String buildWithFormats(String inputFormat, String outputFormat, String serde) {
    return startBuild()
      .append("SET FILEFORMAT INPUTFORMAT '")
      .append(inputFormat)
      .append("' OUTPUTFORMAT '")
      .append(outputFormat)
      .append("' SERDE '")
      .append(serde)
      .append("'")
      .toString();
  }
