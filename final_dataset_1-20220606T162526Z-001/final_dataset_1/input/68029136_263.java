public static List<GenerationUnit> removeDuplicates(List<GenerationUnit> gus) {
		List<GenerationUnit> gusRet = new ArrayList<GenerationUnit>();
		for (GenerationUnit generationUnit : gus) {
			if (!GenerationPackage.isAlreadyInList(generationUnit, gusRet)) {
				gusRet.add(generationUnit);
			}
		}
		return gusRet;
	}
