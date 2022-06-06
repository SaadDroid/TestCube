@Override
	public String primaryTag() {
		return this.locale==null?"*":this.locale.getLanguage();
	}
