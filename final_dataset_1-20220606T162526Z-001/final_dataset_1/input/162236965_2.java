public boolean isRowFixable(int row) {
        return row >= 0 && row < rowFix.size() && isFixingRowsAllowed() ? rowFix.get(row) : false;
    }
