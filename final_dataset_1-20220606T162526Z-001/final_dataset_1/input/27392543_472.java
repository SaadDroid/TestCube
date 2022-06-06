@Override
  public Iterator<JsonElement> getData(CommandOutput<?, ?> response) throws DataRecordException, IOException {
    this.log.debug("Extract data records from resultset");

    RecordSetList<JsonElement> recordSet = this.getNewRecordSetList();

    if (response == null || !this.hasNextRecord()) {
      return recordSet.iterator();
    }

    ResultSet resultset = null;
    Iterator<ResultSet> itr = (Iterator<ResultSet>) response.getResults().values().iterator();
    if (itr.hasNext()) {
      resultset = itr.next();
    } else {
      throw new DataRecordException("Failed to get source record count from database - Resultset has no records");
    }

    try {
      final ResultSetMetaData resultsetMetadata = resultset.getMetaData();

      int batchSize = this.workUnitState.getPropAsInt(ConfigurationKeys.SOURCE_QUERYBASED_FETCH_SIZE, 0);
      batchSize = (batchSize == 0 ? ConfigurationKeys.DEFAULT_SOURCE_FETCH_SIZE : batchSize);

      int recordCount = 0;
      while (resultset.next()) {

        final int numColumns = resultsetMetadata.getColumnCount();
        JsonObject jsonObject = new JsonObject();

        for (int i = 1; i < numColumns + 1; i++) {
          final String columnName = this.getHeaderRecord().get(i - 1);
          jsonObject.addProperty(columnName, parseColumnAsString(resultset, resultsetMetadata, i));

        }

        recordSet.add(jsonObject);

        recordCount++;
        this.totalRecordCount++;

        // Insert records in record set until it reaches the batch size
        if (recordCount >= batchSize) {
          this.log.info("Total number of records processed so far: " + this.totalRecordCount);
          return recordSet.iterator();
        }
      }
      this.setNextRecord(false);
      this.log.info("Total number of records processed so far: " + this.totalRecordCount);
      return recordSet.iterator();
    } catch (Exception e) {
      throw new DataRecordException("Failed to get records from database; error - " + e.getMessage(), e);
    }
  }
