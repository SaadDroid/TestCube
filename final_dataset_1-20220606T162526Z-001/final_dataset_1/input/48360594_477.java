public static ChainResponsibilityHandler createLatinPatternHandler() {
        ChainResponsibilityHandler handler = new LatinLetters();
        handler.linkSuccessor(new LatinLettersSmall()).linkSuccessor(new LatinAsciiDigits());
        return handler;
    }
