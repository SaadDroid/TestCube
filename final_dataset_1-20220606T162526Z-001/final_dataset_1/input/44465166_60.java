public double std() {
        if (min == max || num == 0) {
            return 0;
        }
        double m = mean();
        return Math.sqrt(sigmax2 / num - m * m);
    }
