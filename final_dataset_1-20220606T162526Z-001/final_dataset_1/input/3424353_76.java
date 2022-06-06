public Set<T> getInboundNodes(T node) {
		return get(_inboundEdges, node, false);
	}
