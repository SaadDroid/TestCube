static long getNextSendingInMillis(Record record, long currentTimeMillis) {
        int delta = Const.MILLIS_PER_MINUTE;  // используется, чтобы избежать повторной отправки в одно время.
        int repeatType = record.getRepeatType();

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, record.getHour());
        calendar.set(Calendar.MINUTE, record.getMinute());
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);

        if (repeatType == Record.REPEAT_TYPE_HOURS_IN_DAY || repeatType == Record.REPEAT_TYPE_DAYS_IN_WEEK) {
            // 29 февраля == 1 марта.
            long timeInMillis = calendar.getTimeInMillis();
            // интервал отправки сообщений.
            int interval = (repeatType == Record.REPEAT_TYPE_HOURS_IN_DAY) ?
                    (record.getPeriod() * Const.MILLIS_PER_HOUR) : Const.MILLIS_PER_DAY;

            timeInMillis -= delta;
            while (timeInMillis < currentTimeMillis) {
                timeInMillis += interval;
            }
            while (timeInMillis - interval > currentTimeMillis) {
                timeInMillis -= interval;
            }
            calendar.setTimeInMillis(timeInMillis + delta);
            if (repeatType == Record.REPEAT_TYPE_DAYS_IN_WEEK) {
                while (!record.isDayOfWeekEnabled(calendar.get(Calendar.DAY_OF_WEEK))) {
                    calendar.setTimeInMillis(calendar.getTimeInMillis() + Const.MILLIS_PER_DAY);
                }
            }
        } else if (repeatType == Record.REPEAT_TYPE_DAY_IN_YEAR) {
            calendar.set(Calendar.MONTH, record.getMonth());
            calendar.set(Calendar.DAY_OF_MONTH, record.getDayOfMonth());

            calendar.setTimeInMillis(calendar.getTimeInMillis() - delta);
            while (calendar.getTimeInMillis() < currentTimeMillis) {
                calendar.roll(Calendar.YEAR, true);
            }
            Calendar prevYearCalendar = Calendar.getInstance();
            prevYearCalendar.setTimeInMillis(calendar.getTimeInMillis());
            prevYearCalendar.roll(Calendar.YEAR, false);
            while (prevYearCalendar.getTimeInMillis() > currentTimeMillis) {
                calendar.roll(Calendar.YEAR, false);
                prevYearCalendar.roll(Calendar.YEAR, false);
            }
            calendar.setTimeInMillis(calendar.getTimeInMillis() + delta);
        }

        return calendar.getTimeInMillis();
    }
