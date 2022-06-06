@Override
  public void render(TableRendererConfig config, PrintStream output, Table table) {
    // outer table width
    int width = config.getLineWidth();

    List<String> tableHeader = table.getHeader();
    Iterable<List<String>> tableRows = Iterables.filter(table.getRows(), new Predicate<List<String>>() {
      @Override
      public boolean apply(@Nullable List<String> input) {
        return input != null;
      }
    });

    List<Row> rows = Lists.newArrayList();

    // Collects all output cells for all records.
    // If any record has multiple lines output, a row divider is printed between each row.
    // inner column widths
    int[] columnWidths = calculateColumnWidths(tableHeader, tableRows, width);

    if (columnWidths.length == 0) {
      return;
    }

    boolean useRowDivider = false;
    for (List<String> row : tableRows) {
      useRowDivider = generateRow(row, columnWidths, rows) || useRowDivider;
    }

    // If has header, prints the header.
    if (!tableHeader.isEmpty()) {
      List<Row> headerRow = Lists.newArrayList();
      generateRow(tableHeader, columnWidths, headerRow);

      outputDivider(output, columnWidths, '=', '+');
      for (Row row : headerRow) {
        printRow(output, columnWidths, row);
      }
    }

    // Prints a divider between header and first row if no divider is needed between rows.
    // Otherwise it's printed as part of the following row loop.
    char edgeChar = '+';
    char lineChar = '=';
    if (!useRowDivider) {
      outputDivider(output, columnWidths, lineChar, edgeChar);
    }

    // Output each row.
    for (Row row : rows) {
      if (useRowDivider) {
        // The first divider uses a different set of line and edge char
        // As it's either the separate for the header of the table border (without header case)
        outputDivider(output, columnWidths, lineChar, edgeChar);
        edgeChar = '|';
        lineChar = '-';
      }

      // Print each cell. It has to loop until all lines from all cells are printed.
      printRow(output, columnWidths, row);
    }
    outputDivider(output, columnWidths, '=', '+');
  }
