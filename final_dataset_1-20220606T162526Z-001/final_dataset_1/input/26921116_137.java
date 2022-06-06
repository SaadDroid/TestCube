public BandMatrix(int m, int n, int kl, int ku) {
        if (m <= 0 || n <= 0) {
            throw new IllegalArgumentException(String.format("Invalid matrix size: %d x %d", m, n));
        }

        if (kl < 0 || ku < 0) {
            throw new IllegalArgumentException(String.format("Invalid subdiagonals or superdiagonals: kl = %d, ku = %d", kl, ku));
        }

        if (kl >= m) {
            throw new IllegalArgumentException(String.format("Invalid subdiagonals %d >= %d", kl, m));
        }

        if (ku >= n) {
            throw new IllegalArgumentException(String.format("Invalid superdiagonals %d >= %d", ku, n));
        }

        this.m = m;
        this.n = n;
        this.kl = kl;
        this.ku = ku;
        this.ld = kl + ku + 1;
        this.AB = new double[ld * n];
    }
