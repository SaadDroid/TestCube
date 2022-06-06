@Override
    public void exportQueryResults(final OutputStream outputStream, final HodQueryRequest queryRequest, final ExportFormat exportFormat, final Collection<String> selectedFieldIds, final long totalResults) throws HodErrorException {
        final PlatformDataExportStrategy exportStrategy = exportStrategies.get(exportFormat);
        final List<FieldInfo<?>> fieldInfoList = exportStrategy.getFieldNames(HodMetadataNode.values(), selectedFieldIds);
        final List<String> fieldIds = fieldInfoList.stream()
                .map(FieldInfo::getId)
                .collect(Collectors.toList());

        try {
            exportStrategy.writeHeader(outputStream, fieldInfoList);
            for (int i = 0; i < totalResults; i += PAGINATION_SIZE) {
                final HodQueryRequest paginatedQueryRequest = queryRequest.toBuilder()
                        .start(i + 1)
                        .maxResults(Math.min(i + PAGINATION_SIZE, HodDocumentsService.HOD_MAX_RESULTS))
                        .build();
                final Documents<HodSearchResult> documents = documentsService.queryTextIndex(paginatedQueryRequest.toBuilder()
                        .printFields(fieldIds)
                        .build());


                final List<Function<HodSearchResult, String>> exportMetadataFunctions = Arrays.stream(HodMetadataNode.values())
                        .filter(node -> selectedFieldIds.isEmpty() || selectedFieldIds.contains(node.getName()))
                        .map(node -> (Function<HodSearchResult, String>) hodSearchResult -> {
                            final Object value = node.getGetter().apply(hodSearchResult);
                            return value == null ? "" : value.toString();
                        })
                        .collect(Collectors.toList());

                for (final HodSearchResult searchResult : documents.getDocuments()) {
                    final Stream<String> metadataStream = exportMetadataFunctions.stream()
                            .map(extractor -> extractor.apply(searchResult));

                    final Stream<String> nonMetadataStream = exportStrategy.getConfiguredFieldsById().values().stream()
                            .filter(configuredField -> selectedFieldIds.isEmpty() || selectedFieldIds.contains(configuredField.getId()))
                            .map(configuredField -> {
                                final FieldInfo<?> fieldInfo = searchResult.getFieldMap().get(configuredField.getId());
                                return exportStrategy.combineValues(getValuesAsStrings(fieldInfo));
                            });

                    exportStrategy.exportRecord(outputStream, Stream.concat(metadataStream, nonMetadataStream).collect(Collectors.toList()));
                }
            }
        } catch (final IOException e) {
            //noinspection ProhibitedExceptionThrown
            throw new RuntimeException("Error parsing data", e);
        }

    }
