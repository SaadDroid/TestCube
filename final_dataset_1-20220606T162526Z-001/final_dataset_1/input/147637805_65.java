public double getValue(){
        if (denominator == 0) {
            throw new IllegalArgumentException();
        }
        return ((double) this.numerator)/this.denominator;
    }
