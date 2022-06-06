public final int[] runBatchInsertReturnIds(String sql, final List<List<Object>> batchArgs) {
        Validate.notEmpty(sql, "sql must not be empty");
        Validate.notNull(batchArgs, "batchArgs must not be null");

        final int[] result = new int[batchArgs.size()];
        Arrays.fill(result, 0);

        BatchDataProvider provider = new BatchDataProvider() {

            @Override
            public int getCount() {
                return batchArgs.size();
            }

            @Override
            public List<?> getData(int number) {
                return batchArgs.get(number);
            }

            @Override
            public void insertedItem(int number, int generatedId) {
                result[number] = generatedId;
            }

            @Override
            public void insertedItemLongId(int number, long generatedId) {
                result[number] = (int)generatedId;
            }
        };

        runBatchInsert(sql, provider);
        return result;
    }
