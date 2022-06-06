static ExtractedDate findRelativeDate(String text, long currentTime) {
        ExtractedDate date = null;
        for (DateFormat dateFormat : RegExp.RELATIVE_DATES) {
            Pattern pattern = dateFormat.getPattern();
            Matcher matcher = pattern.matcher(text);
            if (matcher.find()) {
                String relativeTime = matcher.group();
                long number = Long.parseLong(relativeTime.split(" ")[0]);

                String format = dateFormat.getFormat();
                long diffTime = 0;
                if (format.equalsIgnoreCase("min")) {
                    diffTime = TimeUnit.MINUTES.toMillis(number);
                } else if (format.equalsIgnoreCase("hour")) {
                    diffTime = TimeUnit.HOURS.toMillis(number);
                } else if (format.equalsIgnoreCase("day")) {
                    diffTime = TimeUnit.DAYS.toMillis(number);
                } else if (format.equalsIgnoreCase("mon")) {
                    diffTime = number * 30 * 24 * 60 * 60 * 1000;
                } else if (format.equalsIgnoreCase("year")) {
                    diffTime = number * 365 * 24 * 60 * 60 * 1000;
                }
                long relTime = currentTime - diffTime;
                date = new ExtractedDateImpl(relTime);
                break;
            }
        }
        return date;
    }
