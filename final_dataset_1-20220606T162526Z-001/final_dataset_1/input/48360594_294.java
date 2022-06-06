@SuppressWarnings("deprecation")
    Date switchDayMonthValue(Date date) {
        if (date == null) {
            return null;
        }
        int tempMonth = date.getMonth();
        date.setMonth((date.getDate() - 1) % 12);
        date.setDate(tempMonth + 1);
        return date;
    }
