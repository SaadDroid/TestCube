String formatPCollectionNodeDeclaration(PCollectionImpl<?> pcollectionImpl, JobPrototype jobPrototype) {
    String shape = "box";
    if (pcollectionImpl instanceof InputCollection) {
      shape = "folder";
    }

    String size = "";
    try {
      DecimalFormatSymbols formatSymbols = new DecimalFormatSymbols(Locale.ENGLISH);
      DecimalFormat formatter = new DecimalFormat("#,###.##", formatSymbols);
      size = " " + formatter.format(pcollectionImpl.getSize()/1024.0/1024.0) + " Mb";
    } catch (Exception e) {
      // Just skip those that don't have a size
    }

    if (pcollectionImpl instanceof PGroupedTableImpl) {
      int numReduceTasks = ((PGroupedTableImpl) pcollectionImpl).getNumReduceTasks();
      if (numReduceTasks > 0) {
        PGroupedTableImpl pGroupedTable = (PGroupedTableImpl) pcollectionImpl;
        String setByUser = pGroupedTable.isNumReduceTasksSetByUser() ? "Manual" : "Automatic";
        size += " (" + pGroupedTable.getNumReduceTasks() + " " + setByUser + " reducers)";
      }
    }

    return String.format("%s [label=\"%s%s\" shape=%s];",
        formatPCollection(pcollectionImpl, jobPrototype),
        limitNodeNameLength(pcollectionImpl.getName()),
        size,
        shape);
  }
