public Record newRecord(JsonNode node) {
		if (!node.isNullNode()) {
			final Record record = new Record();
			updater.update(record, node);
			return record;
		} else {
			return null;
		}
	}
