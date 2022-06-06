public static Pattern inSameComplex()
	{
		Pattern p = new Pattern(EntityReference.class, "first ER");
		p.add(erToPE(), "first ER", "first simple PE");
		p.add(linkToComplex(), "first simple PE", "Complex");
		p.add(new Type(Complex.class), "Complex");
		p.add(linkToSpecific(), "Complex", "second simple PE");
		p.add(equal(false), "first simple PE", "second simple PE");
		p.add(new PEChainsIntersect(false, true), "first simple PE", "Complex", "second simple PE", "Complex");
		p.add(peToER(), "second simple PE", "second ER");
		p.add(equal(false), "first ER", "second ER");
		return p;
	}
