PairSet generatePairs() {
		PairSet pairs = new PairSet();

		for(int i = 0; i < params.size() - 1; i++) {
			for(ParamValue p1 : params.get(i).values) {
				for(int j = i + 1; j < params.size(); j++) {
					for(ParamValue p2 : params.get(j).values) {
						pairs.register(new Pair(p1, p2));
					}
				}
			}
		}

		return pairs;
	}
