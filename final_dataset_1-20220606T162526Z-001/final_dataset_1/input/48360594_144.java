public double convert(double value) {

        if (noNeedConvert(value)) {
            return value;
        }

        double days = handleDays(value);
        return handleFinalResult(value, days);
    }
