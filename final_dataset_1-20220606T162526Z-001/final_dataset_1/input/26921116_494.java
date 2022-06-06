public static <T> RBFNetwork<T> fit(T[] x, int[] y, RBF<T>[] rbf) {
        return fit(x, y, rbf, false);
    }
