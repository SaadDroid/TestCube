public Map<String, Set<TSnePoint>> fetchTSnePlotWithMetadata(String experimentAccession,
                                                                 int perplexity,
                                                                 String metadataCategory) {
        List<TSnePoint.Dto> pointDtos = tSnePlotDao.fetchTSnePlotForPerplexity(experimentAccession, perplexity);

        // An alternative implementation would be to get the metadata for each cell in the tSnePlotServiceDao method
        // and create TSnePoint.Dto objects with metadata values. This would require separate requests to Solr for
        // each cell ID.
        List<String> cellIds = pointDtos
                .stream()
                .map(TSnePoint.Dto::name)
                .collect(Collectors.toList());

        Map<String, String> metadataValuesForCells =
                cellMetadataDao.getMetadataValueForCellIds(
                        experimentAccession,
                        SingleCellAnalyticsCollectionProxy.metadataAsSchemaField(metadataCategory),
                        cellIds);

        return pointDtos.stream()
                .map(
                        pointDto ->
                                TSnePoint.create(
                                        pointDto.x(),
                                        pointDto.y(),
                                        pointDto.name(),
                                        StringUtils.capitalize(metadataValuesForCells.get(pointDto.name()))))
                .collect(groupingBy(TSnePoint::metadata, mapping(Function.identity(), Collectors.toSet())));
    }
