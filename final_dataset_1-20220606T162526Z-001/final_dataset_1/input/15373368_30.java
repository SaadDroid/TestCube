@Override
    protected Decimal calculate(int index) {
        if (index == 0) {
            return indicator.getValue(0);
        }
        Decimal value = Decimal.ZERO;
        if(index - timeFrame < 0) {
            
            for(int i = index + 1; i > 0; i--) {
                value = value.plus(Decimal.valueOf(i).multipliedBy(indicator.getValue(i-1)));
            }
            return value.dividedBy(Decimal.valueOf(((index + 1) * (index + 2)) / 2));
        }
        
        int actualIndex = index;
        for(int i = timeFrame; i > 0; i--) {
            value = value.plus(Decimal.valueOf(i).multipliedBy(indicator.getValue(actualIndex)));
            actualIndex--;
        }
        return value.dividedBy(Decimal.valueOf((timeFrame * (timeFrame + 1)) / 2));
    }
