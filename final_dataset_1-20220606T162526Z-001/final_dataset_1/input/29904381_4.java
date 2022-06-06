public Component buildComponent(String resourceName)
	{
		component = new Component();
		
		try {read(resourceName);}
		catch (FileNotFoundException e) {e.printStackTrace();}
		catch (Exception e) {e.printStackTrace();}
		
		return component;
	}
