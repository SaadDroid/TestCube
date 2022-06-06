@Override
  public String constructSampleClause() {
    long sampleRowCount = this.getSampleRecordCount();
    if (sampleRowCount >= 0) {
      return " limit " + sampleRowCount;
    }
    return "";
  }
