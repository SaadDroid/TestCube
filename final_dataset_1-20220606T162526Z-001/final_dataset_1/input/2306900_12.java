public RayoNode next(List<RayoNode> nodes) {
		
		lock.lock();
		try {
			boolean recalculate = false;
			for (RayoNode node: nodes) {
				Entry stored = nodeKeys.get(node.getHostname());
				if (stored ==  null) {
					RayoNode clone = clone(node);
					Entry entry = new Entry();
					entry.expected = node.getWeight();
					entry.node = clone;
					entries.add(entry);
					nodeKeys.put(node.getHostname(), entry);
					recalculate = true;
				} else {
					if (stored.node.getWeight() != node.getWeight() ||
						stored.node.getPriority() != node.getPriority()) {
						stored.node.setWeight(node.getWeight());
						stored.node.setPriority(node.getPriority());
						stored.expected = stored.node.getWeight();
						
						recalculate = true;
					}
				}
			}
			if (recalculate) {
				recalculate();
			}
			
			RayoNode node = loadNextEntry();
			while (node != null && !nodes.contains(node) ) {
				removeNode(node);
				currentEntry--;
				recalculate();
				node = loadNextEntry();
			}
			return node;
		} finally {
			lock.unlock();
		}
	}
