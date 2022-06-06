private void highlight(InputFileContext ctx, TextRange range, TypeOfText typeOfText) {
    newHighlighting.highlight(ctx.textRange(range), typeOfText);
  }
