public static int[][] sliceArray(int[] array, int batchSize) {
        if(array == null) {
            return null;
        }
        int length = array.length;

        if(length <= batchSize) {
            return new int[][]{array};
        }

        int batches = length / batchSize;
        if(length % batchSize > 0) {
            batches++;
        }

        int[][] result = new int[batches][];
        int offset = 0;
        for(int i=0; i<batches; i++) {
            int nextSize = i < batches - 1 ? batchSize : length - offset;
            result[i] = new int[nextSize];
            System.arraycopy(array, offset, result[i], 0, nextSize);
            offset += nextSize;
        }
        return result;
    }
