LocalDate convertInternal(LocalDate value) {
        if (value.isAfter(LocalDate.of(-1, 1, 1)) && value.isBefore(LocalDate.of(100, 1, 1))) {
            LocalDate resultDate = value;
            LocalDate pivotLocalDate = LocalDate.now().withYear(getCurrentYear()).minusYears(80);
            int pivotYear = pivotLocalDate.getYear() % 100;
            int pivotCentury = pivotLocalDate.minusYears(pivotYear).getYear();
            if (resultDate.getYear() < pivotYear) {
                resultDate = resultDate.plusYears(100);
            }
            resultDate = resultDate.plusYears(pivotCentury);
            return resultDate;
        } else {
            return value;
        }
    }
