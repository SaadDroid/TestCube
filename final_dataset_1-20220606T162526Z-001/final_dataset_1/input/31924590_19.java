public static String getRegexPattern(final SimpleDateFormat dateFormat) {
		final PatternContext pattern = new PatternContext(dateFormat.toPattern());

		// G Era designator
		pattern.replace(Pattern.compile("G+"), dateFormat.getDateFormatSymbols().getEras());

		// y Year
		pattern.replace(Pattern.compile("[y]{3,}"), "\\d{4}");
		pattern.replace(Pattern.compile("[y]{2}"), "\\d{2}");
		pattern.replace(Pattern.compile("y"), "\\d{4}");

		// M Month in year
		pattern.replace(Pattern.compile("[M]{3,}"), dateFormat.getDateFormatSymbols().getMonths(),
				dateFormat.getDateFormatSymbols().getShortMonths());
		pattern.replace(Pattern.compile("[M]{2}"), "\\d{2}");
		pattern.replace(Pattern.compile("M"), "\\d{1,2}");

		// w Week in year
		pattern.replace(Pattern.compile("w+"), "\\d{1,2}");

		// W Week in month
		pattern.replace(Pattern.compile("W+"), "\\d");

		// D Day in year
		pattern.replace(Pattern.compile("D+"), "\\d{1,3}");

		// d Day in month
		pattern.replace(Pattern.compile("d+"), "\\d{1,2}");

		// F Day of week in month
		pattern.replace(Pattern.compile("F+"), "\\d");

		// E Day in week
		pattern.replace(Pattern.compile("E+"), dateFormat.getDateFormatSymbols().getWeekdays(),
				dateFormat.getDateFormatSymbols().getShortWeekdays());

		// a Am/pm marker
		pattern.replace(Pattern.compile("a+"), dateFormat.getDateFormatSymbols().getAmPmStrings());

		// H Hour in day (0-23)
		pattern.replace(Pattern.compile("H+"), "\\d{1,2}");

		// k Hour in day (1-24)
		pattern.replace(Pattern.compile("k+"), "\\d{1,2}");

		// K Hour in am/pm (0-11)
		pattern.replace(Pattern.compile("K+"), "\\d{1,2}");

		// h Hour in am/pm (1-12)
		pattern.replace(Pattern.compile("h+"), "\\d{1,2}");

		// m Minute in hour
		pattern.replace(Pattern.compile("m+"), "\\d{1,2}");

		// s Second in minute
		pattern.replace(Pattern.compile("s+"), "\\d{1,2}");

		// S Millisecond
		pattern.replace(Pattern.compile("S+"), "\\d{1,3}");

		// z Time zone
		pattern.replace(Pattern.compile("z+"), "[a-zA-Z-+:0-9]*");

		// Z Time zone
		pattern.replace(Pattern.compile("Z+"), "[-+]\\d{4}");

		return pattern.toString();
	}
