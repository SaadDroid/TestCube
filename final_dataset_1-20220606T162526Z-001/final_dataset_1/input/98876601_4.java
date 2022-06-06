public static String timeZone2Lucene(String date) {
		if (GetterUtil.getLong(date) > 0) {
			return new SimpleDateFormat(LUCENE_DATE_FORMAT).format(new Date(GetterUtil.getLong(date)));
		} else {
			Date d = _stringToDate(date, ISO8601);
			return new SimpleDateFormat(LUCENE_DATE_FORMAT).format(d);
		}
	}
