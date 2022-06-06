public static double computePearsonCorrelationCoefficient(List<Double> x, List<Double> y) {

        double sumX = 0.;
        double sumY = 0.;

        for (Double v : x) {
            sumX += v;
        }
        for (Double v : y) {
            sumY += v;
        }

        double avgX = sumX / x.size();
        double avgY = sumY / y.size();

        double nominator = 0.;
        double denominatorX = 0.;
        double denominatorY = 0.;

        for (int i = 0; i < x.size(); i++) {
            nominator += (x.get(i) - avgX) * (y.get(i) - avgY);
            denominatorX += Math.pow(x.get(i) - avgX, 2);
            denominatorY += Math.pow(y.get(i) - avgY, 2);
        }

        double denominator = Math.sqrt(denominatorX * denominatorY);

        return nominator / denominator;
    }
