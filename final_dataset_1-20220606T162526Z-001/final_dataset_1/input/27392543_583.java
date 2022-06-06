@Override
  public Iterator<HiveDataset> getDatasetsIterator() throws IOException {

    return new AbstractIterator<HiveDataset>() {
      private Iterator<DbAndTable> tables = getTables().iterator();

      @Override
      protected HiveDataset computeNext() {
        while (this.tables.hasNext()) {
          DbAndTable dbAndTable = this.tables.next();

          try (AutoReturnableObject<IMetaStoreClient> client = HiveDatasetFinder.this.clientPool.getClient()) {
            Table table = client.get().getTable(dbAndTable.getDb(), dbAndTable.getTable());
            if (tableFilter.isPresent() && !tableFilter.get().apply(table)) {
              continue;
            }

            Config datasetConfig = getDatasetConfig(table);
            if (ConfigUtils.getBoolean(datasetConfig, HIVE_DATASET_IS_BLACKLISTED_KEY, DEFAULT_HIVE_DATASET_IS_BLACKLISTED_KEY)) {
              continue;
            }

            if (HiveDatasetFinder.this.eventSubmitter.isPresent()) {
              SlaEventSubmitter.builder().datasetUrn(dbAndTable.toString())
              .eventSubmitter(HiveDatasetFinder.this.eventSubmitter.get()).eventName(DATASET_FOUND).build().submit();
            }

            return createHiveDataset(table, datasetConfig);
          } catch (IllegalArgumentException e) {
            Throwables.propagate(e);
          } catch (Throwable t) {
            log.error(String.format("Failed to create HiveDataset for table %s.%s", dbAndTable.getDb(), dbAndTable.getTable()), t);

            if (HiveDatasetFinder.this.eventSubmitter.isPresent()) {
              SlaEventSubmitter.builder().datasetUrn(dbAndTable.toString())
                  .eventSubmitter(HiveDatasetFinder.this.eventSubmitter.get()).eventName(DATASET_ERROR)
                  .additionalMetadata(FAILURE_CONTEXT, t.toString()).build().submit();
            }
          }
        }
        return endOfData();
      }
    };
  }
