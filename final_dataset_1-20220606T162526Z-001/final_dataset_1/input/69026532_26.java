public String toXml()
	{
		return "<product id=\"" + getId() 
			+ "\" title=\"" + getTitle() + "\" price=\""
			+ getPrice()/100.0 + "\"/>";
	}
