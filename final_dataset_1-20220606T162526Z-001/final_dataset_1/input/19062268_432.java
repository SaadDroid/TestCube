@Override
	public Set<URI> types() {
		Property property = this.individual.property(RDF.TYPE.as(URI.class));
		if(property==null) {
			return Collections.emptySet();
		}
		TypeCollector collector = new TypeCollector();
		for(Value value:property) {
			value.accept(collector);
		}
		return collector.collectedTypes();
	}
