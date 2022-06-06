public SpanType getSpanType(final int rowIndex, final int modelColumn) {
        if (getGrid() == null) {
            return SpanType.NORMAL_CELL;
        }

        if (rowIndex < 0 || modelColumn < 0 || rowIndex >= getItems().size() || modelColumn >= getGrid().getColumnCount()) {
            return SpanType.NORMAL_CELL;
        }

        final SpreadsheetCell cell = getCellsView().getItems().get(rowIndex).get(modelColumn);

        final int cellColumn = getHiddenColumns().nextClearBit(cell.getColumn());
//        final int cellRow = spv.getViewRow(cell.getRow());
        int cellRowSpan = getRowSpanFilter(cell);//cell.getRowSpan();

        if (cellColumn == modelColumn /*&& cellRow == rowIndex*/ && cellRowSpan == 1) {
            return SpanType.NORMAL_CELL;
        }
//        cellRowSpan = spv.getRowSpanFilter(cell);
        final int cellColumnSpan = getColumnSpan(cell);
        /**
         * This is a consuming operation so we place it after the normal_cell
         * case since this is the most typical case.
         */
        final GridViewSkin skin = getCellsViewSkin();
        final boolean containsRowMinusOne = skin == null ? true : skin.containsRow(rowIndex - 1);
        //If the cell above is the same.
        final boolean containsSameCellMinusOne = rowIndex > 0
                ? getCellsView().getItems().get(rowIndex - 1).get(modelColumn) == cell
                : false;
        if (containsRowMinusOne && cellColumnSpan > 1 && cellColumn != modelColumn && cellRowSpan > 1
                && containsSameCellMinusOne) {
            return SpanType.BOTH_INVISIBLE;
        } else if (cellRowSpan > 1 && cellColumn == modelColumn) {
            if ((!containsSameCellMinusOne || !containsRowMinusOne)) {
                return SpanType.ROW_VISIBLE;
            } else {
                return SpanType.ROW_SPAN_INVISIBLE;
            }
        } else if (cellColumnSpan > 1 && (!containsSameCellMinusOne || !containsRowMinusOne)) {
            /**
             * If the next visible column from the starting column is my
             * viewColumn, it means all columns before me are hidden and I must
             * show myself.
             */
//            int columnVisible = spv.getHiddenColumns().nextClearBit(cell.getColumn());
            if (cellColumn == modelColumn) {
                return SpanType.NORMAL_CELL;
            } else {
                return SpanType.COLUMN_SPAN_INVISIBLE;
            }
        } else {
            return SpanType.NORMAL_CELL;
        }
    }
