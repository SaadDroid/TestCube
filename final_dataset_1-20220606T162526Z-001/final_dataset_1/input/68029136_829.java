public void validateFreemarkerSyntax(String freemarkerContent) throws AMWException {
        Objects.requireNonNull(freemarkerContent, "freemarker content must not be null");
		Configuration c = new Configuration();
		c.setStrictSyntaxMode(true);
		c.setTagSyntax(Configuration.AUTO_DETECT_TAG_SYNTAX);
		String templateName = "validation";

		StringTemplateLoader stringLoader = new StringTemplateLoader();
		stringLoader.putTemplate(templateName, freemarkerContent);
		c.setTemplateLoader(stringLoader);
		try {
			c.getTemplate(templateName);
		}
		catch (ParseException e) {
			// Validation failed! - was not able to parse the template!
			throw new AMWException("The template is syntactically incorrect: " + e.getMessage(), e);
		}
		catch (IOException e) {
			// Something else went wrong
			throw new AMWException("The template can not be validated: " + e.getMessage(), e);
		}
	}
