public static DeterministicAnnealing fit(double[][] data, int Kmax) {
        return fit(data, Kmax, 0.9, 100, 1E-4, 1E-2);
    }
