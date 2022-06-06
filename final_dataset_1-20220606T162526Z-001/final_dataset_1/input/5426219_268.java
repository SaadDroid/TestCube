public static SolrQuery createSolrQuery(String experimentAccession, BaselineRequestPreferences<?> reqPreferences) {

        AnalyticsCollectionProxy.AnalyticsSchemaField expressionLevelField =
                reqPreferences.getUnit() == ExpressionUnit.Absolute.Rna.FPKM ?
                        EXPRESSION_LEVEL_FPKM :
                        EXPRESSION_LEVEL;

        SolrQueryBuilder<AnalyticsCollectionProxy> solrQueryBuilder = new SolrQueryBuilder<>();

        // A single term OR boolean query will result in a single field query: foo:"bar"
        solrQueryBuilder
                .addFilterFieldByTerm(EXPERIMENT_ACCESSION, experimentAccession)
                .addFilterFieldByRangeMin(expressionLevelField, reqPreferences.getCutoff());

        Optional<String> assayGroupIds =
                reqPreferences.getSelectedColumnIds().isEmpty() ?
                        Optional.empty() :
                        Optional.of(
                                "(" +
                                createOrBooleanQuery(ASSAY_GROUP_ID, reqPreferences.getSelectedColumnIds()) +
                                ")");

        Optional<String> geneQuery =
                reqPreferences.getGeneQuery().isEmpty() ?
                        Optional.empty() :
                        Optional.of(
                                "(" +
                                AnalyticsCollectionProxy.asAnalyticsGeneQuery(reqPreferences.getGeneQuery()).entrySet()
                                        .stream()
                                        .map(entry -> createOrBooleanQuery(entry.getKey(), entry.getValue()))
                                        .collect(joining(" OR ")) +
                                ")");

        String query = Stream.concat(mapToStream(assayGroupIds), mapToStream(geneQuery)).collect(joining(" AND "));

        return solrQueryBuilder.build().setQuery(query.isEmpty() ? "*:*" : query);
    }
