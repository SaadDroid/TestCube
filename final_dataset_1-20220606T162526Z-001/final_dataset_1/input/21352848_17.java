public static void main(String[] args) throws Exception {
//        FlinkPdCommandConfig config = FlinkPdCommandConfig.from(args);
//        run(config);
//        final ExecutionEnvironment env = ExecutionEnvironment.getExecutionEnvironment();
//        final String filename = URLDecoder.decode("file:/C:/git/flink/readFileTest/target/classes/ex1.html", "UTF-8");
//        Path filePath = new Path(filename);
//        TextInputFormat inp = new TextInputFormat(filePath);
//        inp.setCharsetName("UTF-8");
//        inp.setDelimiter("</ARXIVFILESPLIT>");
//        final DataSource<String> source = env.readFile(inp, filename);
//        source.writeAsText("test", org.apache.flink.core.fs.FileSystem.WriteMode.OVERWRITE);
//        env.execute();
        final ExecutionEnvironment env = ExecutionEnvironment.getExecutionEnvironment();

        // get input data
        ClassLoader classLoader = WordCount.class.getClassLoader();
        URL resource = classLoader.getResource("com/formulasearchengine/mathosphere/mathpd/ex1.html");
        final String filename = URLDecoder.decode(resource.getFile(), "UTF-8");
        //final String filename = URLDecoder.decode("file:/C:/git/flink/readFileTest/target/classes/ex1.html", "UTF-8");
        Path filePath = new Path(filename);
        TextInputFormat inp = new TextInputFormat(filePath);
        inp.setCharsetName("UTF-8");
        inp.setDelimiter("</ARXIVFILESPLIT>");
        final DataSource<String> source = env.readFile(inp, filename);
//		DataSet<Tuple2<String, Integer>> counts =
//				// split up the lines in pairs (2-tuples) containing: (word,1)
//				source.flatMap(new LineSplitter())
//				// group by the tuple field "0" and sum up tuple field "1"
//				.groupBy(0)
//				.sum(1);

        // execute and print result
        //counts.print();
        source.writeAsText("test", FileSystem.WriteMode.OVERWRITE);
        env.execute();
    }
