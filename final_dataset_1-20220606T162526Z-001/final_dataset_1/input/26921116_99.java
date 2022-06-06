public static int[][] clone(int[][] x) {
        int[][] matrix = new int[x.length][];
        for (int i = 0; i < x.length; i++) {
            matrix[i] = x[i].clone();
        }

        return matrix;
    }
