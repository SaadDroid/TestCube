@Override
	public int compare(TemplateDescriptorEntity arg0, TemplateDescriptorEntity arg1) {
		if(arg0== null && arg1 == null 
				|| arg0.getName()== null && arg1.getName() == null){
			return 0;
		}else if(arg0== null || arg0.getName() == null){
			return -1;
		}
		else if(arg1== null || arg1.getName() == null){
			return 1;
		}else{
			// compare by Name
			return arg0.getName().compareTo(arg1.getName());
		}
	}
