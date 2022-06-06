public static int monthNameToNumber(String monthName) {
        String month = monthName;
        month = month.replaceAll(",", "");
        month = month.replaceAll("\\.", "");
        month = month.replaceAll(" ", "");
        month = month.toLowerCase();
        int monthNumber = -1;
        if (month.equals("january") || month.equals("januar") || month.equals("jan")) {
            monthNumber = 1;
        } else if (month.equals("february") || month.equals("februar") || month.equals("feb")) {
            monthNumber = 2;
        } else if (month.equals("march") || month.equals("märz") || month.equals("mär") || month.equals("mar")) {
            monthNumber = 3;
        } else if (month.equals("april") || month.equals("apr")) {
            monthNumber = 4;
        } else if (month.equals("may") || month.equals("mai") || month.equals("may")) {
            monthNumber = 5;
        } else if (month.equals("june") || month.equals("juni") || month.equals("jun")) {
            monthNumber = 6;
        } else if (month.equals("july") || month.equals("juli") || month.equals("jul")) {
            monthNumber = 7;
        } else if (month.equals("august") || month.equals("aug")) {
            monthNumber = 8;
        } else if (month.equals("september") || month.equals("sep") || month.equals("sept")) {
            monthNumber = 9;
        } else if (month.equals("october") || month.equals("oktober") || month.equals("oct") || month.equals("okt")) {
            monthNumber = 10;
        } else if (month.equals("november") || month.equals("nov")) {
            monthNumber = 11;
        } else if (month.equals("december") || month.equals("dezember") || month.equals("dec") || month.equals("dez")) {
            monthNumber = 12;
        }
        return monthNumber;
    }
