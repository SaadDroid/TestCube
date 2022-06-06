@Override
	public int hashCode() {
		int hash=19*this.locale.hashCode();
		for(Entry<String,V> entry:super.entrySet()) {
			hash*=convertKey(entry.getKey()).hashCode()^entry.getValue().hashCode();
		}
		return hash;
	}
