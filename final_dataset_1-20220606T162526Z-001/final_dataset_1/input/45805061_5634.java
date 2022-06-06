@Override
  public Object getRowValueAt(int rowIndex, int columnIndex) {
    if (rowIndex < 0 || rowIndex >= _rows.size()) {
      throw new IllegalArgumentException("RowIndex must be in range 0 >= rowIndex < " + _rows.size());
    }
    if (columnIndex < 0 || columnIndex >= getColumnCount()) {
      throw new IllegalArgumentException("ColumnIndex must be in range 0 >= columnIndex < " + getColumnCount());
    }
    return Iterables.get(Iterables.get(_rows, rowIndex), columnIndex);
  }
