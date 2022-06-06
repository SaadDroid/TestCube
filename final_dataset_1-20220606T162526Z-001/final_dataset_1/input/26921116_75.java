public static int[] colMax(int[][] data) {
        int[] x = new int[data[0].length];
        Arrays.fill(x, Integer.MIN_VALUE);

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < x.length; j++) {
                if (x[j] < data[i][j]) {
                    x[j] = data[i][j];
                }
            }
        }

        return x;
    }
