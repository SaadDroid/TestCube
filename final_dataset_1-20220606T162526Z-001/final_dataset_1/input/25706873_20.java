public V put(K key, V value) {
		Objects.requireNonNull(key);
		version++;
		int index = probe(key);
		boolean isNew = index < 0;
		V result = isNew ? null : translator.deserializeValue(table[index]);
		if (isNew) {
			if (size == MAX_TABLE_LEN - 1)  // Because table.length is a power of 2, and at least one slot must be free
				throw new IllegalStateException("Maximum size reached");
			index = ~index;
			if (table[index] != TOMBSTONE) {
				filled++;
			}
		}
		table[index] = translator.serialize(key, value);
		if (isNew) {
			incrementSize();
			if (filled == MAX_TABLE_LEN)
				resize(table.length);
		}
		return result;
	}
