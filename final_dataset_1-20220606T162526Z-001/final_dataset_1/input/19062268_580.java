@Override
	public boolean equals(Object obj) {
		boolean result = false;
		if(obj instanceof Element) {
			Element that=(Element)obj;
			result=
				Objects.equals(this.name,that.name()) &&
				Objects.equals(this.parameters,that.parameters());
		}
		return result;
	}
