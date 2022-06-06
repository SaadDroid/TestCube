public static void configureIncrementalLoad(Job job, HTable table)
  throws IOException {
    Configuration conf = job.getConfiguration();

    job.setOutputKeyClass(ImmutableBytesWritable.class);
    job.setOutputValueClass(KeyValue.class);
    job.setOutputFormatClass(HFileOutputFormat.class);

    // Based on the configured map output class, set the correct reducer to properly
    // sort the incoming values.
    // TODO it would be nice to pick one or the other of these formats.
    if (KeyValue.class.equals(job.getMapOutputValueClass())) {
      job.setReducerClass(KeyValueSortReducer.class);
    } else if (Put.class.equals(job.getMapOutputValueClass())) {
      job.setReducerClass(PutSortReducer.class);
    } else if (Text.class.equals(job.getMapOutputValueClass())) {
      job.setReducerClass(TextSortReducer.class);
    } else {
      LOG.warn("Unknown map output value type:" + job.getMapOutputValueClass());
    }

    conf.setStrings("io.serializations", conf.get("io.serializations"),
        MutationSerialization.class.getName(), ResultSerialization.class.getName(),
        KeyValueSerialization.class.getName());

    // Use table's region boundaries for TOP split points.
    LOG.info("Looking up current regions for table " + Bytes.toString(table.getTableName()));
    List<ImmutableBytesWritable> startKeys = getRegionStartKeys(table);
    LOG.info("Configuring " + startKeys.size() + " reduce partitions " +
        "to match current region count");
    job.setNumReduceTasks(startKeys.size());

    configurePartitioner(job, startKeys);
    // Set compression algorithms based on column families
    configureCompression(table, conf);
    configureBloomType(table, conf);
    configureBlockSize(table, conf);

    TableMapReduceUtil.addDependencyJars(job);
    TableMapReduceUtil.initCredentials(job);
    LOG.info("Incremental table " + Bytes.toString(table.getTableName()) + " output configured.");
  }
