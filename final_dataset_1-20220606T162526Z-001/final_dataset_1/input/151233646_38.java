public void parseFluxResponse(@Nonnull final BufferedSource bufferedSource,
                                  @Nonnull final Cancellable cancellable,
                                  @Nonnull final FluxResponseConsumer consumer) throws IOException {

        Arguments.checkNotNull(bufferedSource, "bufferedSource");

        Reader reader = new InputStreamReader(bufferedSource.inputStream());

        ParsingState parsingState = ParsingState.NORMAL;

        try (CSVParser parser = new CSVParser(reader, CSVFormat.DEFAULT)) {
            int tableIndex = 0;
            int tableId = -1;
            boolean startNewTable = false;
            FluxTable table = null;
            for (CSVRecord csvRecord : parser) {

                if (cancellable.isCancelled()) {
                    return;
                }

                long recordNumber = csvRecord.getRecordNumber();

                //
                // Response has HTTP status ok, but response is error.
                //
                if (ERROR_RECORD_INDEX == recordNumber && csvRecord.get(1).equals("error")
                        && csvRecord.get(2).equals("reference")) {

                    parsingState = ParsingState.IN_ERROR;
                    continue;
                }

                //
                // Throw InfluxException with error response
                //
                if (ParsingState.IN_ERROR.equals(parsingState)) {
                    String error = csvRecord.get(1);
                    String referenceValue = csvRecord.get(2);

                    int reference = 0;
                    if (referenceValue != null && !referenceValue.isEmpty()) {
                        reference = Integer.valueOf(referenceValue);
                    }

                    throw new FluxQueryException(error, reference);
                }

                String token = csvRecord.get(0);
                //// start new table
                if ("#datatype".equals(token)) {
                    startNewTable = true;

                    table = new FluxTable();
                    consumer.accept(tableIndex, cancellable, table);
                    tableIndex++;
                    tableId = -1;

                } else if (table == null) {
                    String message = "Unable to parse CSV response. FluxTable definition was not found.";
                    throw new FluxCsvParserException(message);
                }

                //#datatype,string,long,dateTime:RFC3339,dateTime:RFC3339,dateTime:RFC3339,double,string,string,string
                if ("#datatype".equals(token)) {
                    addDataTypes(table, toList(csvRecord));

                } else if ("#group".equals(token)) {
                    addGroups(table, toList(csvRecord));

                } else if ("#default".equals(token)) {
                    addDefaultEmptyValues(table, toList(csvRecord));

                } else {
                    // parse column names
                    if (startNewTable) {
                        addColumnNamesAndTags(table, toList(csvRecord));
                        startNewTable = false;
                        continue;
                    }

                    int currentId = Integer.parseInt(csvRecord.get(1 + 1));
                    if (tableId == -1) {
                        tableId = currentId;
                    }

                    if (tableId != currentId) {
                        //create new table with previous column headers settings
                        List<FluxColumn> fluxColumns = table.getColumns();
                        table = new FluxTable();
                        table.getColumns().addAll(fluxColumns);
                        consumer.accept(tableIndex, cancellable, table);
                        tableIndex++;
                        tableId = currentId;
                    }

                    FluxRecord fluxRecord = parseRecord(tableIndex - 1, table, csvRecord);
                    consumer.accept(tableIndex - 1, cancellable, fluxRecord);
                }
            }
        }
    }
