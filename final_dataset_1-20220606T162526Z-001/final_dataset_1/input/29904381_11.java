public void render(List list, OfxLatexRenderer parent) throws OfxAuthoringException
	{	
		if(!list.isSetType()){throw new OfxAuthoringException("<type> not defined for <list>");}
		estimateType(list.getType());
		
		String debugType=null;
		if(list.getType().isSetDescription() && list.getType().isDescription()){debugType=ListType.description.toString()+" "+List.class.getSimpleName();}
		else{debugType = "("+listType+") "+List.class.getSimpleName();}
		
		if(preBlankLine){preTxt.add("");}
		preTxt.addAll(LatexCommentRenderer.stars());
		preTxt.addAll(LatexCommentRenderer.comment("Rendering a "+debugType+" with: "+this.getClass().getSimpleName()));
		if(list.isSetComment())
		{
			LatexCommentRenderer rComment = new LatexCommentRenderer(cmm,dsm);
			rComment.render(list.getComment());
			preTxt.addAll(rComment.getContent());
		}
		preTxt.add("");
		
		setEnvironment(list.getType(),parent);
		for(Item item : list.getItem())
		{
			LatexItemFactory f = new LatexItemFactory(cmm,dsm);
			f.render(listType,item);
			renderer.add(f);
		}
		postTxt.add("");
	}
