@Override
	public DataSetValueModel getDataSetProperty(String propertyName) {
		if(!dataSetProperties.containsKey(propertyName)) {
			throw new RuntimeException("No such dataSet property '"+describeProperty(propertyName)+"'");
		}
		
		DataSetPropertyValueModel property = dataSetProperties.get(propertyName);
		if (property == null) {
			dataSetProperties.put(propertyName, supply.createDataSetProperty(propertyName));
			property = dataSetProperties.get(propertyName);
		}
		return property;
	}
