public static <R> void buildGraph(final NodeLoader<R> loader, EtlFlow flow)
    {
        final Graph.GraphBuilder<NodeOperator<R>, Void> graphBuilder = Graph.builder();
        final List<NodeInfo> nodes = flow.getNodes();
        final List<EdgeInfo> edges = flow.getEdges();

        nodes.forEach(nodeInfo -> {
            final Map<String, Object> config = nodeInfo.getUserConfig();
            String driverString = nodeInfo.getDriverClass();
            String id = nodeInfo.getNodeId();

            switch (nodeInfo.getNodeType()) {
                case "source":
                    graphBuilder.addNode(id, new NodeOperator<>(loader.loadSource(driverString, config)));
                    break;
                case "transform":
                    graphBuilder.addNode(id, new NodeOperator<>(loader.loadTransform(driverString, config)));
                    break;
                case "sink":
                    graphBuilder.addNode(id, new NodeOperator<>(loader.loadSink(driverString, config)));
                    break;
                default:
                    throw new IllegalArgumentException("Unknown type: " + nodeInfo);
            }
        });

        edges.forEach(edgeInfo -> graphBuilder.addEdge(
                edgeInfo.getInNodeId().split("-")[0],
                edgeInfo.getOutNodeId().split("-")[0]
        ));

        Graph<NodeOperator<R>, Void> graph = graphBuilder.create();
        graph.printShow().forEach(System.out::println);
        NodeOperator.runGraph(graph);
    }
