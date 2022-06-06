public void map(ImmutableBytesWritable key, Result value,
      OutputCollector<ImmutableBytesWritable,Result> output,
      Reporter reporter) throws IOException {

    // convert
    output.collect(key, value);
  }
