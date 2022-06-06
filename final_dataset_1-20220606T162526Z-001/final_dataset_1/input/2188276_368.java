@Override
	public synchronized   List<IWikiTableConfiguration> getConfigurations(){
		List<IWikiTableConfiguration> result = new ArrayList<IWikiTableConfiguration>();
		
		result.addAll(getBuildInConfigurations());
		result.addAll(getUserSpecificConfigurations());
		
		sortByName(result);
		return result;
	}
