public static <T> Ruleset<T> buildRules(Collection<Set<T>> data, double minSupport, double minConfidence) {
		List<Rule<T>> rules = new ArrayList<>();
		Map<Set<T>, Double> itemsets = extractItemsets(data, minSupport);
		for (Entry<Set<T>, Double> itemset : itemsets.entrySet()) {
			Set<T> l_k = itemset.getKey();
			if (l_k.size() < 2) {
				continue;
			}
			double support = itemset.getValue();
			Set<Set<T>> H_m = getSingleItemSets(l_k);
			// rules with one-item consequents (see sec. 3 in paper)
			for (Set<T> Y : H_m) {
				Set<T> X = new HashSet<>(l_k);
				X.removeAll(Y);
				double confidence = confidence(X, Y, data);
				if (confidence >= minConfidence) {
					double lift = confidence / support(Y, data);
					rules.add(new Rule<>(X, Y, support, confidence, lift));
				}
			}
			// ap-genrules (see sec. 3.1 in paper)
			for (int m = 1; m < l_k.size() - 1; m++) {
				Set<Set<T>> H_m_plus_1 = aprioriGen(H_m);
				Iterator<Set<T>> iterator = H_m_plus_1.iterator();
				while (iterator.hasNext()) {
					Set<T> Y = iterator.next();
					Set<T> X = new HashSet<>(l_k);
					X.removeAll(Y);
					double confidence = confidence(X, Y, data);
					if (confidence >= minConfidence) {
						double lift = confidence / support(Y, data);
						rules.add(new Rule<>(X, Y, support, confidence, lift));
					} else {
						iterator.remove();
					}
				}
				H_m = H_m_plus_1;
			}
		}
		Collections.sort(rules);
		return new Ruleset<>(rules);
	}
