public void scanForIgnoredSections(String originalXml) {
        this.originalXml = originalXml;
        SortpomPiScanner sortpomPiScanner = new SortpomPiScanner(logger);
        sortpomPiScanner.scan(originalXml);
        if (sortpomPiScanner.isScanError()) {
            throw new FailureException(sortpomPiScanner.getFirstError());
        }
        containsIgnoredSections = sortpomPiScanner.containsIgnoredSections();
    }
