public static Pair<Double, Double> getInterpolationWeights(ZonedDateTime accrualStartDate, 
      ZonedDateTime accrualEndDate, ZonedDateTime firstInterpolatedDate, ZonedDateTime secondInterpolatedDate) {
    ArgumentChecker.isTrue(!accrualEndDate.isBefore(firstInterpolatedDate), 
        "First interpolated date {} should be before or equal to the accrual end date {}", 
        firstInterpolatedDate, accrualEndDate);
    ArgumentChecker.isTrue(!accrualEndDate.isAfter(secondInterpolatedDate), 
        "Second interpolated date {} should be equal to or after the accrual end date {}", 
        secondInterpolatedDate, accrualEndDate);
    ArgumentChecker.isTrue(firstInterpolatedDate.isBefore(secondInterpolatedDate), 
        "First interpolated date {} should be strictly before the second interpolated date {}",
        firstInterpolatedDate, secondInterpolatedDate);
    double daysToPeriodEnd = accrualEndDate.toLocalDate().toEpochDay() - accrualStartDate.toLocalDate().toEpochDay();
    double daysToFirstInterpolatedRateDate = 
        firstInterpolatedDate.toLocalDate().toEpochDay() - accrualStartDate.toLocalDate().toEpochDay();
    double daysToSecondInterpolatedRateDate = 
        secondInterpolatedDate.toLocalDate().toEpochDay() - accrualStartDate.toLocalDate().toEpochDay();
    double weightDenominator = daysToSecondInterpolatedRateDate - daysToFirstInterpolatedRateDate;
    double weightFirstIndex = (daysToSecondInterpolatedRateDate - daysToPeriodEnd) / weightDenominator;
    double weightSecondIndex = (daysToPeriodEnd - daysToFirstInterpolatedRateDate) / weightDenominator;
    return Pairs.of(weightFirstIndex, weightSecondIndex);
  }
