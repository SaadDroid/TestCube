@Override
    public GetSplitsResponse doGetSplits(BlockAllocator blockAllocator, GetSplitsRequest request)
    {
        if (request.getPartitions().getRowCount() != 1) {
            throw new RuntimeException("Unexpected number of partitions encountered.");
        }

        Block partitions = request.getPartitions();
        String redisEndpoint = getValue(partitions, 0, REDIS_ENDPOINT_PROP);
        String redisValueType = getValue(partitions, 0, VALUE_TYPE_TABLE_PROP);

        if (redisEndpoint == null) {
            throw new RuntimeException("Table is missing " + REDIS_ENDPOINT_PROP + " table property");
        }

        if (redisValueType == null) {
            throw new RuntimeException("Table is missing " + VALUE_TYPE_TABLE_PROP + " table property");
        }

        logger.info("doGetSplits: Preparing splits for {}", BlockUtils.rowToString(partitions, 0));

        KeyType keyType = null;
        Set<String> splitInputs = new HashSet<>();

        String keyPrefix = getValue(partitions, 0, KEY_PREFIX_TABLE_PROP);
        if (keyPrefix != null) {
            //Add the prefixes to the list and set the key type.
            splitInputs.addAll(Arrays.asList(keyPrefix.split(KEY_PREFIX_SEPERATOR)));
            keyType = KeyType.PREFIX;
        }
        else {
            String prop = getValue(partitions, 0, ZSET_KEYS_TABLE_PROP);
            if (prop == null) {
                throw new RuntimeException("Table is missing " + ZSET_KEYS_TABLE_PROP +
                        " table property, it must have this or " + KEY_PREFIX_TABLE_PROP);
            }
            String[] partitionPrefixes = prop.split(KEY_PREFIX_SEPERATOR);

            ScanResult<String> keyCursor = null;
            //Add all the values in the ZSETs ad keys to scan
            for (String next : partitionPrefixes) {
                do {
                    keyCursor = loadKeys(redisEndpoint, next, keyCursor, splitInputs);
                }
                while (keyCursor != null && !END_CURSOR.equals(keyCursor.getCursor()));
            }
            keyType = KeyType.ZSET;
        }

        Set<Split> splits = new HashSet<>();
        for (String next : splitInputs) {
            splits.addAll(makeSplits(request, redisEndpoint, next, keyType, redisValueType));
        }

        return new GetSplitsResponse(request.getCatalogName(), splits, null);
    }
