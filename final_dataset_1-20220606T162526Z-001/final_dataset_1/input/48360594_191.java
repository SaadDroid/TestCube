@Override
    public String convert(String inputDateStr) {
        if (StringUtils.isEmpty(inputDateStr)) {
            return inputDateStr;
        }
        String outputDateStr = inputDateStr;
        LocalDate localDate = super.parseStringToDate(inputDateStr);
        if (localDate == null) {
            return outputDateStr;
        }
        if (convertCalendarToTemporal) {// Calendar->TemporalField
            outputDateStr = Long.toString(localDate.getLong(outputTemporalField));
        } else {
            if (inputTemporalField != null && outputTemporalField != null) {// TemporalField->another TemporalField
                outputDateStr = Long.toString(localDate.getLong(outputTemporalField));
            } else {// TemporalField->Calendar
                outputDateStr = formatDateToString(localDate);
            }
        }
        return outputDateStr;
    }
