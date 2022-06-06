public static <T> KNN<T> fit(T[] x, int[] y, Distance<T> distance) {
        return fit(x, y, 1, distance);
    }
