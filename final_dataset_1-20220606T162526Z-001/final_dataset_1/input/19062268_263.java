@Override
	protected final String fillInQuery(Map<String, String> namedGraphs) {
		String result=getTemplate();
		for(Entry<String,String> entry:namedGraphs.entrySet()) {
			result=result.replace("${"+entry.getKey()+"}", "<"+entry.getValue()+">");
		}
		return result;
	}
