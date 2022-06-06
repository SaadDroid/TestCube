public static Date calculateNextTermBeginAfter(Date after, Date startDate, boolean excludeFirstTerm, ValidRuntimes runtimes) {
		if (after == null) {
			return null;
		}
		if (startDate == null) {
			return null;
		}
		if (runtimes == null) {
			return null;
		}

		Calendar afterCal = Calendar.getInstance();
		afterCal.setTime(DateUtil.endOfDay(after));

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(startDate);

		// If fixed terms is true, virtually delay the start of the contract to the next period.
		if (runtimes.fixedTerms) {
			switch (runtimes.firstMinRuntimeType) {
				case WEEKS:
					calendar.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
					calendar.add(Calendar.WEEK_OF_YEAR, 1);
					break;
				case MONTHS:
					calendar.set(Calendar.DAY_OF_MONTH, 1);
					calendar.add(Calendar.MONTH, 1);
					break;
				case YEARS:
					calendar.set(Calendar.DAY_OF_YEAR, 1);
					calendar.add(Calendar.YEAR, 1);
					break;
				default:
			}

		}

		boolean first = true;
		boolean validResult = true;

		while (validResult && (!calendar.after(afterCal) || (first && excludeFirstTerm))) {
			if (first) {
				validResult = addToCalendar(calendar, runtimes.firstMinRuntimeType, runtimes.firstMinRuntimeCount);
				first = false;
			} else {
				validResult = addToCalendar(calendar, runtimes.followingMinRuntimeType, runtimes.followingMinRuntimeCount);
			}
		}

		return validResult ? calendar.getTime() : null;
	}
