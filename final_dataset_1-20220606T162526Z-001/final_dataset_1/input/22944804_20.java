public int compareTo(ComparisonResult o) {
		if (o == null) {
			return 1;
		} else {
			if (!o.getPenaltyPoints().equals(getPenaltyPoints())) {
				return getPenaltyPoints().compareTo(o.getPenaltyPoints());
			} else {
				return getAdditionalInfoInCurrentValue().compareTo(o.getAdditionalInfoInCurrentValue());
			}
		}
	}
