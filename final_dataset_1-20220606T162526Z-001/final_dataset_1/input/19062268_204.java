@Override
	public void checkSubType(final String subType) {
		validateLength(subType,"Subtype");
		validateFirstChar(subType,"subtype");
		validateOtherChars(subType,"subtype");
	}
