@Override
  public TextRange rangeToHighlight() {
    if (body == null) {
      return textRange();
    }

    TextRange bodyRange = body.metaData().textRange();
    List<TextRange> tokenRangesBeforeBody = metaData().tokens().stream()
      .map(Token::textRange)
      .filter(t -> t.start().compareTo(bodyRange.start()) < 0)
      .collect(Collectors.toList());

    // for ruby when body is empty, "when expr" is body meta, so there is nothing before
    if (tokenRangesBeforeBody.isEmpty()) {
      return bodyRange;
    }
    return TextRanges.merge(tokenRangesBeforeBody);
  }
