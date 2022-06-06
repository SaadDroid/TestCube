public void addXsdImport(String locationInDeployment, String xsdNamespace) {
		if(pdd.getReferences() == null) {
			pdd.addNewReferences();
		}
		
		SchemaType xsdRef = pdd.getReferences().addNewSchema();
		xsdRef.setLocation(locationInDeployment);
		xsdRef.setNamespace(xsdNamespace);
	}
