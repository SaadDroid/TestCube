public static Path exportSubgraphToHDFSParallel(GraphDatabaseService db) throws IOException, URISyntaxException {
        FileSystem fs = FileUtil.getHadoopFileSystem();
        Path pt = new Path(ConfigurationLoader.getInstance().getHadoopHdfsUri() + EDGE_LIST_RELATIVE_FILE_PATH.replace("{job_id}", ""));
        BufferedWriter br = new BufferedWriter(new OutputStreamWriter(fs.create(pt)));

        Integer reportBlockSize = 20000;
        Transaction tx = db.beginTx();

        // Get all nodes in the graph
        Iterable<Node> nodes = GlobalGraphOperations.at(db)
                .getAllNodes();

        br.write("# Adacency list" + "\n");

        List<Spliterator<Node>> spliteratorList = new ArrayList<>();
        boolean hasSpliterator = true;
        Spliterator<Node> nodeSpliterator = nodes.spliterator();

        while (hasSpliterator) {
            Spliterator<Node> localSpliterator = nodeSpliterator.trySplit();
            hasSpliterator = localSpliterator != null;
            if (hasSpliterator)
                spliteratorList.add(localSpliterator);
        }

        tx.success();
        tx.close();

        counter = 0;

        if (spliteratorList.size() > 4) {
            // Fork join
            ParallelWriter parallelWriter = new ParallelWriter<Node>(spliteratorList.toArray(new Spliterator[spliteratorList.size()]),
                    new GraphWriter(0, spliteratorList.size(), br, spliteratorList.size(), reportBlockSize, db, ConfigurationLoader.getInstance().getMazerunnerRelationshipType()));
            ForkJoinPool pool = new ForkJoinPool();
            pool.invoke(parallelWriter);
        } else {
            // Sequential
            spliteratorList.forEach(sl -> sl.forEachRemaining(n -> {
                try {
                    writeBlockForNode(n, db, br, reportBlockSize, ConfigurationLoader.getInstance().getMazerunnerRelationshipType());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }));
        }

        System.out.println("Mazerunner Export Status: " + MessageFormat.format("{0,number,#.##%}", 1.0));

        br.flush();
        br.close();

        return pt;
    }
