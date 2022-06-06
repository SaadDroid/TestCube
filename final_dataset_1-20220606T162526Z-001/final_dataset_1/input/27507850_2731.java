@Override
  public TableAnswerElement answer(NetworkSnapshot snapshot) {
    ParseWarningQuestion question = (ParseWarningQuestion) _question;
    TableMetadata metadata = createMetadata(question);
    Map<String, ColumnMetadata> columnMetadataMap = metadata.toColumnMap();

    ParseVendorConfigurationAnswerElement pvcae =
        _batfish.loadParseVendorConfigurationAnswerElement(snapshot);

    Map<String, Warnings> fileWarnings = pvcae.getWarnings();

    ImmutableList.Builder<Row> rows = ImmutableList.builder();

    if (question.getAggregateDuplicates()) {
      aggregateDuplicateParseWarnings(fileWarnings)
          .forEach(
              (triplet, fileLines) ->
                  rows.add(getAggregateRow(triplet, fileLines, columnMetadataMap)));

    } else {
      fileWarnings.forEach(
          (filename, warnings) -> {
            for (ParseWarning w : warnings.getParseWarnings()) {
              rows.add(getRow(filename, w, columnMetadataMap));
            }
          });
    }

    TableAnswerElement answerElement = new TableAnswerElement(createMetadata(question));
    answerElement.postProcessAnswer(_question, rows.build());
    return answerElement;
  }
