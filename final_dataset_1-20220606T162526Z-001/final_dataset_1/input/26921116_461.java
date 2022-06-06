public static LinearModel fit(Formula formula, DataFrame data, Properties prop) {
        double lambda1 = Double.valueOf(prop.getProperty("smile.elastic.net.lambda1"));
        double lambda2 = Double.valueOf(prop.getProperty("smile.elastic.net.lambda2"));
        double tol = Double.valueOf(prop.getProperty("smile.elastic.net.tolerance", "1E-4"));
        int maxIter = Integer.valueOf(prop.getProperty("smile.elastic.net.max.iterations", "1000"));
        return fit(formula, data, lambda1, lambda2, tol, maxIter);
    }
