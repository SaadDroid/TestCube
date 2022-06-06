public String getTagsAsList(List<PropertyTagEntity> globalPropertyTags) {
        StringBuilder sb = new StringBuilder();
        if(globalPropertyTags != null){
            int count = 0;
            for (PropertyTagEntity tag : globalPropertyTags){
            	if(tag.getName() != null && !tag.getName().isEmpty()){
            		if(count > 0){
                        sb.append(", ");
                    }
                    sb.append("'");
                    sb.append(tag.getName());
                    sb.append("'");

                    count ++;
            	}
            }
        }
        return sb.toString();
    }
