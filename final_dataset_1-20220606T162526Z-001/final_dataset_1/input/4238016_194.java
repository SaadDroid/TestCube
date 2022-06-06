@ModelAttribute
	public SystemSettingsForm createSystemSettingsForm(
			@RequestParam(required=false) String documentrHost,
			@RequestParam(required=false) String siteNotice,
			@RequestParam(required=false) String mailHostName,
			@RequestParam(required=false) Integer mailHostPort,
			@RequestParam(required=false) String mailSenderEmail,
			@RequestParam(required=false) String mailSenderName,
			@RequestParam(required=false) String mailSubjectPrefix,
			@RequestParam(required=false) String mailDefaultLanguage,
			@RequestParam(required=false) Integer bcryptRounds,
			@RequestParam(required=false) String pageFooterHtml,
			@RequestParam(required=false) String updateCheckInterval,
			WebRequest webRequest) {

		SortedMap<String, SortedMap<String, String>> allMacroSettings = getMacroSettingsFromRequest(webRequest);
		return new SystemSettingsForm(
				Strings.emptyToNull(documentrHost),
				Strings.emptyToNull(siteNotice),
				Strings.emptyToNull(mailHostName),
				(mailHostPort != null) ? mailHostPort : Integer.MIN_VALUE,
				Strings.emptyToNull(mailSenderEmail),
				Strings.emptyToNull(mailSenderName),
				Strings.emptyToNull(mailSubjectPrefix),
				Strings.emptyToNull(mailDefaultLanguage),
				(bcryptRounds != null) ? bcryptRounds : Integer.MIN_VALUE,
				Strings.emptyToNull(pageFooterHtml),
				Strings.emptyToNull(updateCheckInterval),
				allMacroSettings);
	}
