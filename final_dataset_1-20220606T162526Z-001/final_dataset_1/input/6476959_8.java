public static <T extends WtNode> String print(
			HtmlRendererCallback callback,
			WikiConfig wikiConfig,
			PageTitle pageTitle,
			T node)
	{
		return print(callback, wikiConfig, new StringWriter(), pageTitle, node).toString();
	}
