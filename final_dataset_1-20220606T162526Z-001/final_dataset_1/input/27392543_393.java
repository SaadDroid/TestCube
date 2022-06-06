@Override
  public void write(GenericRecord value, VectorizedRowBatch output)
      throws IOException {

    int row = output.size++;
    for (int c = 0; c < converters.length; ++c) {
      ColumnVector col = output.cols[c];
      if (value.get(c) == null) {
        col.noNulls = false;
        col.isNull[row] = true;
      } else {
        col.isNull[row] = false;
        converters[c].addValue(row, c, value.get(c), col);
      }
    }
  }
