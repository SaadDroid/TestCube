public static List<JspMacroDescriptor> getMacros() {
		List<IMacroDescriptor> descs = Lists.newArrayList(macroFactory.getDescriptors());
		final Locale locale = LocaleContextHolder.getLocale();
		final Collator collator = Collator.getInstance(locale);
		Collections.sort(descs, new Comparator<IMacroDescriptor>() {
			@Override
			public int compare(IMacroDescriptor d1, IMacroDescriptor d2) {
				String title1 = d1.getTitle(locale);
				String title2 = d2.getTitle(locale);
				return collator.compare(title1, title2);
			}
		});
		Function<IMacroDescriptor, JspMacroDescriptor> function = new Function<IMacroDescriptor, JspMacroDescriptor>() {
			@Override
			public JspMacroDescriptor apply(IMacroDescriptor descriptor) {
				return new JspMacroDescriptor(descriptor, locale);
			}
		};
		return Lists.transform(descs, function);
	}
