public void render(Section section) throws OfxAuthoringException, OfxConfigurationException
	{
		if(!section.isSetContainer()){section.setContainer(false);}
		if(section.isContainer()){lvl=lvl-1;}
		
		preTxt.addAll(LatexCommentRenderer.stars());
		if(section.isContainer() && section.isSetInclude())
		{
			if(section.getContent().size()>0)
			{
				preTxt.addAll(LatexCommentRenderer.comment("All content of "+Section.class.getSimpleName()+" will be ignored because of inlcude"));
			}
			LatexIncludeRenderer rComment = new LatexIncludeRenderer(cmm,dsm);
			rComment.render(Section.class,section.getInclude(),true);
			renderer.add(rComment);
			return;
		}

		preTxt.addAll(LatexCommentRenderer.comment("Rendering a "+Section.class.getSimpleName()+" with: "+this.getClass().getSimpleName()));
		
		for(Object s : section.getContent())
		{
			if (s instanceof Comment)
			{
				LatexCommentRenderer rComment = new LatexCommentRenderer(cmm,dsm);
				rComment.render((Comment)s);
				renderer.add(rComment);
			}
		}
		
		logger.trace("Render section");
		
		
		
		for(Object s : section.getContent())
		{
			if     (s instanceof String){}
			else if(s instanceof Title){renderTitle(section,(Title)s);}
			else if(s instanceof Section){renderSection((Section)s);}
			else if(s instanceof Paragraph){paragraphRenderer((Paragraph)s,true);}
			else if(s instanceof Table){renderTable((Table)s);}
			else if(s instanceof List){renderList((List)s,this);}
            else if(s instanceof Listing){renderListing((Listing)s);}
            else if(s instanceof Image){renderImage((Image)s);}
            else if(s instanceof Comment){}
			else {logger.warn("No Renderer for Element "+s.getClass().getSimpleName());}
		}
//		if(section.getContent()logger.debug(getSectionHeader("x"));
		
	}
