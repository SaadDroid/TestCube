public static <OUTPUT> Case<OUTPUT> compose(
		CaseCompositionMode caseCompositionMode,
		Case[] baseCases,
		BiFunction<Random, Object[], OUTPUT> composition
	) {
		FuzzyPreconditions.checkNotNull("caseCompositionMode is required.", caseCompositionMode);
		FuzzyPreconditions.checkNotNullAndContainsNoNulls(baseCases);
		FuzzyPreconditions.checkNotNull("composition function is required.", composition);

		Subcase[][] composedSubcases = caseCompositionMode.algorithm.apply(baseCases);
		Set<Subcase<OUTPUT>> subcases = new HashSet<>();
		for(final Subcase[] subcase : composedSubcases) {
			subcases.add(r -> {
				Object[] values = new Object[subcase.length];
				for (int j = 0; j < subcase.length; j++) {
					@SuppressWarnings("unchecked")
					Subcase<?> supplier = (Subcase<?>) subcase[j];
					values[j] = supplier.generate(r);
				}
				return composition.apply(r, values);
			});
		}

		return () -> subcases;
	}
