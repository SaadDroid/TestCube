@Override
  public int run(String[] args) throws Exception {
    if (args.length != 2) {
      usage();
      return -1;
    }

    String dirPath = args[0];
    TableName tableName = TableName.valueOf(args[1]);

    boolean tableExists = this.doesTableExist(tableName);
    if (!tableExists) this.createTable(tableName,dirPath);

    Path hfofDir = new Path(dirPath);
    HTable table = new HTable(getConf(), tableName);

    doBulkLoad(hfofDir, table);
    return 0;
  }
