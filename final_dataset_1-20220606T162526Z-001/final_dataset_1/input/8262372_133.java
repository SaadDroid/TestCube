public static void initTableMapperJob(String table, Scan scan,
      Class<? extends TableMapper> mapper,
      Class<?> outputKeyClass,
      Class<?> outputValueClass, Job job)
  throws IOException {
    initTableMapperJob(table, scan, mapper, outputKeyClass, outputValueClass,
        job, true);
  }
