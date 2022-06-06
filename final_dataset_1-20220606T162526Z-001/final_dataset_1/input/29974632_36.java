@RequestMapping(value = "entity-facts", method = RequestMethod.GET)
    public List<SourcedFact> getEntityFacts(
        @RequestParam(ENTITY_PARAM) final String entity,
        @RequestParam(value = MAX_RESULTS_PARAM, required = false) final Integer maxResults,
        @RequestParam(INDEXES_PARAM) final Collection<String> databases
    ) {
        final AciParameters params = new AciParameters(AnswerServerActions.Report.name());
        params.add(ReportParams.Entity.name(), entity);
        if (maxResults != null) {
            params.add(ReportParams.MaxResults.name(), maxResults);
        }

        final ReportResponsedata entityInfo = aciService.executeAction(
            configService.getConfig().getAnswerServer().toAciServerDetails(),
            params, reportProcessor);
        final List<ReportFact> reportFacts;
        if (entityInfo.getReport() != null) {
            reportFacts = entityInfo.getReport().getItem().stream()
                .flatMap(item -> item.getMetadata().getFact().stream())
                .limit(maxResults == null ? DEFAULT_MAX_FACTS : maxResults)
                .collect(Collectors.toList());
        } else {
            reportFacts = Collections.emptyList();
        }

        // filter facts results to those extracted from visible documents
        // the backend may return the same fact multiple times (eg. with different dates)
        final Map<String, SourcedFact> sourcedFacts = new HashMap<>();
        if (!reportFacts.isEmpty()) {
            final FieldText fieldText = new MATCH(
                "*/" + FACT_ID_FIELD,
                reportFacts.stream().map(ReportFact::getSource).collect(Collectors.toList()));
            final IdolQueryRestrictions queryRestrictions =
                queryRestrictionsBuilderFactory.getObject()
                    .fieldText(fieldText.toString())
                    .databases(databases)
                    .build();

            final IdolQueryRequest queryRequest = queryRequestBuilderFactory.getObject()
                .queryRestrictions(queryRestrictions)
                .maxResults(reportFacts.size() * 100) // expect no more than 100 documents per fact
                .queryType(QueryRequest.QueryType.RAW)
                .print(PrintParam.Fields.name())
                .printField(FACT_ID_FIELD)
                .printField(FACT_SENTENCE_FIELD)
                .build();

            final Documents<IdolSearchResult> docs = documentsService.queryTextIndex(queryRequest);

            // get important parts from docs, indexing by fact ID
            final Map<String, List<DocumentFact>> docsByFactId = new HashMap<>();
            for (final IdolSearchResult doc : docs.getDocuments()) {
                for (final FieldValue<?> factsField : doc.getFieldMap().get("facts").getValues()) {
                    // unpack result of RecordType.parseValue
                    for (final Serializable factField :
                        ((Map<String, List<Serializable>>) factsField.getValue())
                            .get("fact_extract_")
                    ) {
                        final List<String> factIds = ((Map<String, List<String>>) factField)
                            .getOrDefault("id", Collections.emptyList());
                        final String sentence =
                            ((Map<String, List<String>>) factField).get("sentence").get(0);
                        for (final String factId : factIds) {
                            if (!docsByFactId.containsKey(factId)) {
                                docsByFactId.put(factId, new ArrayList<>());
                            }
                            docsByFactId.get(factId).add(
                                new DocumentFact(doc.getIndex(), doc.getReference(), sentence));
                        }
                    }
                }
            }

            for (final ReportFact reportFact : reportFacts) {
                if (docsByFactId.containsKey(reportFact.getSource())) {
                    sourcedFacts.put(reportFact.getSource(),
                        new SourcedFact(reportFact, docsByFactId.get(reportFact.getSource())));
                }
            }
        }

        return new ArrayList<>(sourcedFacts.values());
    }
