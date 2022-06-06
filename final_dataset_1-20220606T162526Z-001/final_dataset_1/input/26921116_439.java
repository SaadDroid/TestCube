public static <T> KernelMachine<T> fit(T[] x, double[] y, MercerKernel<T> kernel, double lambda) {
        if (x.length != y.length) {
            throw new IllegalArgumentException(String.format("The sizes of X and Y don't match: %d != %d", x.length, y.length));
        }

        if (lambda < 0.0) {
            throw new IllegalArgumentException("Invalid regularization parameter lambda = " + lambda);
        }

        int n = x.length;

        Matrix K = new Matrix(n, n);
        K.uplo(UPLO.LOWER);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                double k = kernel.k(x[i], x[j]);
                K.set(i, j, k);
                K.set(j, i, k);
            }

            K.add(i, i, lambda);
        }

        Matrix.Cholesky cholesky = K.cholesky(true);
        double[] w = cholesky.solve(y);

        return new KernelMachine<>(kernel, x, w);
    }
