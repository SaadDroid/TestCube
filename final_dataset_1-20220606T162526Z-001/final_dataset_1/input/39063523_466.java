public static void sortByDate(List<String> expiryDates) {
        Collections.sort(expiryDates, (lhs, rhs) -> {
            Date date = parseString(lhs, SIMPLE_DATE_FORMAT);
            if (date != null) {
                return date.compareTo(parseString(rhs, SIMPLE_DATE_FORMAT));
            } else {
                return 0;
            }
        });
    }
