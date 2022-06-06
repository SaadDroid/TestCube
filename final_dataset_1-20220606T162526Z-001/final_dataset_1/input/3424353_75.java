public Set<Pair<T>> getEdges() {
		Set<Pair<T>> edges = new HashSet<Pair<T>>();
		for (T from : _outboundEdges.keySet()) {
			for (T to : _outboundEdges.get(from))
				edges.add(Tuples.pair(from, to));
		}
		return edges;
	}
