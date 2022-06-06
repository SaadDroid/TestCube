public String getTagsAsCommaSeparatedString(List<PropertyTagEntity> propertyTags){
        StringBuilder result = new StringBuilder();
        if (propertyTags != null) {
            for (PropertyTagEntity tag : propertyTags) {
            	if(tag.getName() != null && !tag.getName().isEmpty()){
            		result.append(tag.getName()).append(",");
            	}
            }
        }
        return result.toString();
    }
