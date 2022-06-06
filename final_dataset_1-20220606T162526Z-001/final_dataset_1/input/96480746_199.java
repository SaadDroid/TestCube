public static String nextReducedVariableWord(String string, int offset) {
		return nextWord(string, offset, new ReducedVariableWordEndDetector());
	}
