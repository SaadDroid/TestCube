public String processNonCacheableMacros(String html, String projectName, String branchName, String path,
			Authentication authentication, Locale locale, String contextPath) {

		HtmlSerializerContext context = new HtmlSerializerContext(projectName, branchName, path, this, authentication, locale,
				pageStore, systemSettingsStore, contextPath);
		String startMarkerPrefix = "__" + NON_CACHEABLE_MACRO_MARKER + "_"; //$NON-NLS-1$ //$NON-NLS-2$
		String endMarkerPrefix = "__/" + NON_CACHEABLE_MACRO_MARKER + "_"; //$NON-NLS-1$ //$NON-NLS-2$
		String bodyMarker = "__" + NON_CACHEABLE_MACRO_BODY_MARKER + "__"; //$NON-NLS-1$ //$NON-NLS-2$
		for (;;) {
			int start = html.indexOf(startMarkerPrefix);
			if (start < 0) {
				break;
			}
			start += startMarkerPrefix.length();

			int end = html.indexOf('_', start);
			if (end < 0) {
				break;
			}
			String idx = html.substring(start, end);

			start = html.indexOf("__", start); //$NON-NLS-1$
			if (start < 0) {
				break;
			}
			start += 2;

			end = html.indexOf(endMarkerPrefix + idx + "__", start); //$NON-NLS-1$
			if (end < 0) {
				break;
			}

			String macroCallWithBody = html.substring(start, end);
			String macroCall = StringUtils.substringBefore(macroCallWithBody, bodyMarker);
			String body = StringUtils.substringAfter(macroCallWithBody, bodyMarker);
			String macroName = StringUtils.substringBefore(macroCall, " "); //$NON-NLS-1$
			String params = StringUtils.substringAfter(macroCall, " "); //$NON-NLS-1$
			IMacro macro = macroFactory.get(macroName);
			MacroContext macroContext = MacroContext.create(macroName, params, body, context, locale, beanFactory);
			IMacroRunnable macroRunnable = macro.createRunnable();

			html = StringUtils.replace(html,
					startMarkerPrefix + idx + "__" + macroCallWithBody + endMarkerPrefix + idx + "__", //$NON-NLS-1$ //$NON-NLS-2$
					StringUtils.defaultString(macroRunnable.getHtml(macroContext)));

			MacroInvocation invocation = new MacroInvocation(macroName, params);
			html = cleanupHtml(html, Collections.singletonList(invocation), false);
		}
		return html;
	}
