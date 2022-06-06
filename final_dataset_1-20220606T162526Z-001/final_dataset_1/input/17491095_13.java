public List<String> sort(List<Class<?>> classes) throws OrderSortCycleException {
        List<String> result = new ArrayList<>();
        SimpleDirectedGraph<String, DefaultEdge> graph = new SimpleDirectedGraph<>(DefaultEdge.class);
        
        for (OrderConstraint orderConstraint : getConstraints(classes)) {
            graph.addVertex(orderConstraint.getFirst());
            graph.addVertex(orderConstraint.getSecond());
            
            graph.addEdge(orderConstraint.getFirst(), orderConstraint.getSecond());
        }
        
        CycleDetector<String, DefaultEdge> cycleDetector = new CycleDetector<>(graph);
        if(!cycleDetector.detectCycles()) {
                        for (TopologicalOrderIterator<String, DefaultEdge> iterator = new TopologicalOrderIterator<>(graph); iterator.hasNext();) {
                result.add(iterator.next());
            }
        } else {
            String cycles = Joiner.on(", ").join(cycleDetector.findCycles());
            
            throw new OrderSortCycleException("The given order constraints contain (at least one) cycle. Cycles can only "
                    + "be caused by static references because we have single inherintance only in Java (involved classes: '" + cycles + "').");
        }

        return result;
    }
