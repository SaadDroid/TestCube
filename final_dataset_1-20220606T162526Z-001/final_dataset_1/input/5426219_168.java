public List<String> getArrayDesignAccessions() {
        return arrayDesigns.stream().map(a -> a.accession()).collect(Collectors.toList());
    }
