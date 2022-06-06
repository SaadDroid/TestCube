public void render(Object parent, Image image) throws OfxAuthoringException
	{
		setEnvironment(parent);
		
		if(!image.isSetMedia()){throw new OfxAuthoringException(Image.class.getSimpleName()+" has no "+Media.class.getSimpleName());}
		
		renderPre(image);

		if(Environment.Figure.equals(environment) && image.isSetAlignment()){alignment(image.getAlignment());}
		
		StringBuffer sb = new StringBuffer();
		if(Environment.Cell.equals(environment)){sb.append("$\\vcenter{\\hbox{");}
		sb.append(" \\includegraphics");
		sb.append(imageArguments(image));
		sb.append("{").append(cmm.getImageRef(image.getMedia())).append("}");
		if(Environment.Cell.equals(environment)){sb.append("}}$");}
		txt.add(sb.toString());
		
		renderPost(image);
	}
