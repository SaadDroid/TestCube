public double convert(double value) {
        if (Double.isNaN(value)) {
            return value;
        }
        if (this.deFrom.equals(this.deTo)) {
            return value;
        }
        BigDecimal bdResult = new BigDecimal(String.valueOf(value)).multiply(this.multiplier);
        return bdResult.doubleValue();
    }
