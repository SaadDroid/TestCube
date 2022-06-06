public Date generateDuplicate(Date date, Function function, int modifCount, String extraParameter) {
        if (date == null || function == null) {
            return date;
        }
        Date newDate = new Date(date.getTime());
        switch (function) {
        case SET_TO_NULL:
            return null;
        case MODIFY_DATE_VALUE:
            for (int i = 0; i < modifCount; i++) {
                dateChanger.modifyDateValue(newDate);
            }
            return newDate;
        case SWITCH_DAY_MONTH_VALUE:
            for (int i = 0; i < modifCount; i++) {
                dateChanger.switchDayMonthValue(newDate);
            }
            return newDate;
        case REPLACE_BY_RANDOM_DATE:
            for (int i = 0; i < modifCount; i++) {
                dateChanger.replaceWithRandomDate(newDate);
            }
            return newDate;
        default:
            break;
        }
        return date;
    }
