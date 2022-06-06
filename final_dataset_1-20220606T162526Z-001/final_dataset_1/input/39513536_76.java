public String normalize(String biopaxOwlData) {
		
		if(biopaxOwlData == null || biopaxOwlData.length() == 0) 
			throw new IllegalArgumentException("no data. " + description);
		
		// quick-fix for older BioPAX L3 version (v0.9x) property 'taxonXref' (range: BioSource)
		biopaxOwlData = biopaxOwlData.replaceAll("taxonXref","xref");
		
		// build the model
		Model model = null;
		try {
			model = biopaxReader.convertFromOWL(
				new ByteArrayInputStream(biopaxOwlData.getBytes("UTF-8")));
		} catch (UnsupportedEncodingException e) {
			throw new IllegalArgumentException("Failed! " + description, e);
		}
		
		if(model == null) {
			throw new IllegalArgumentException("Failed to create Model! " 
					+ description);
		}
		
		// auto-convert to Level3 model
		if (model.getLevel() != BioPAXLevel.L3) {
			log.info("Converting model to BioPAX Level3...");
			model = (new LevelUpgrader()).filter(model);
		}
		
		normalize(model); // L3 only!
		
		// return as BioPAX OWL
		return convertToOWL(model);
	}
