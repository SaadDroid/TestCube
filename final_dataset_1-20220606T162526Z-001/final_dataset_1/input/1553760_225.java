protected void configureStylesheets(HtmlDocumentBuilder builder, String relativePath) {
		for (String cssStylesheetUrl : stylesheetUrls) {
			builder.addCssStylesheet(
					new HtmlDocumentBuilder.Stylesheet(computeResourcePath(cssStylesheetUrl, relativePath)));
		}
	}
