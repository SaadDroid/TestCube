@JsonIgnore
    public Set<String> listTemplateFiles() {
        return Stream.of(searchResult, promotion, previewPanel, documentFacts, entitySearch, entityFacts, entityFactsDetail)
                .flatMap(Collection::stream)
                .map(Template::getFile)
                .collect(Collectors.toSet());
    }
