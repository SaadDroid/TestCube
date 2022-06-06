@Override
	public HtmlSubsetLanguage clone() {
		HtmlSubsetLanguage copy = new HtmlSubsetLanguage(getName(), documentHandler, headingLevel, supportedBlockTypes,
				supportedSpanTypes, tagNameSubstitutions, spanElementStrategies, xhtmlStrict, supportsImages);
		copy.setFileExtensions(getFileExtensions());
		copy.setExtendsLanguage(getExtendsLanguage());
		copy.setParseCleansHtml(isParseCleansHtml());
		return copy;
	}
