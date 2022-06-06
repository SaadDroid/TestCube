public static String getCostConsumptionForADeployment(Cost cost, String applicationName, String deploymentId) {
		cost.setChargesDescription("Charges estimation in EUROS");
		cost.setPowerDescription("N/A");
		cost.setEnergyDescription("N/A");
		
		String parentHref = "/applications/" + applicationName + "/deployments/" + deploymentId;
		cost.setHref(parentHref + "/cost-consumption");
		
		List<Link> links = new ArrayList<Link>();
		cost.setLinks(links);
		
		Link linkParent = new Link();
		linkParent.setHref(parentHref);
		linkParent.setRel("parent");
		linkParent.setType(MediaType.APPLICATION_XML);
		links.add(linkParent);
		
		Link linkSelf = new Link();
		linkSelf.setHref(cost.getHref());
		linkSelf.setRel("self");
		linkSelf.setType(MediaType.APPLICATION_XML);
		links.add(linkSelf);
		
		return ModelConverter.objectCostToXML(cost);
	}
