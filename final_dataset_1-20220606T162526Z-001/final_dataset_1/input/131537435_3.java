public boolean boundedBFS(K src, K trg) {
        if (!adjacencyMap.containsKey(src)) {
            // this is the first time we encounter this vertex
            return false;
        } else {
            Set<K> visited = new HashSet<>();
            Queue<Node> queue = new LinkedList<>();

            // add the src neighbors
            for (K neighbor : adjacencyMap.get(src)) {
                queue.add(new Node(neighbor, 1));
            }
            visited.add(src);

            while (!queue.isEmpty()) {
                Node current = queue.peek();
                if (current.id().equals(trg)) {
                    // we found the trg in <= k levels
                    return true;
                } else {
                    queue.remove();
                    visited.add(current.id());

                    // bound the BFS to k steps
                    if (current.level() < factorK) {
                        for (K neighbor : adjacencyMap.get(current.id())) {
                            if (!visited.contains(neighbor)) {
                                queue.add(new Node(neighbor, current.level() + 1));
                            }
                        }
                    }
                }
            }
            return false;
        }
    }
