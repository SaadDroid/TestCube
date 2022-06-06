void deleteRange(K key, K endKey, long revision) {
        try (DeleteOp<K, V> op = opFactory.newDelete(
            key,
            opFactory.optionFactory().newDeleteOption()
                .endKey(endKey)
                .prevKv(false)
                .build())) {
            try (DeleteResult<K, V> result = delete(revision, op)) {
                if (Code.OK != result.code()) {
                    throw new MVCCStoreException(result.code(),
                        "Failed to delete key=" + key + "from state store " + name);
                }
            }
        }
    }
