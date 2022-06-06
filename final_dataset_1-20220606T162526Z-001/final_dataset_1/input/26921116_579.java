public static EVD eigen(Matrix A, int k, Ritz ritz) {
        return eigen(A, k, ritz, 1E-8, 10 * A.nrows());
    }
