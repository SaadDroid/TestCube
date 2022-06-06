@Override
  public List<ValidationError> innerValidate(DocumentHandler handler)
      throws ValidationException {
    List<ValidationError> result = new ArrayList<ValidationError>(0);

    PDDocumentCatalog catalog = handler.getDocument().getDocumentCatalog();
    if (catalog != null) {
      PDDocumentOutline outlineHierarchy = catalog.getDocumentOutline();
      if (outlineHierarchy != null) {
        if (outlineHierarchy.getFirstChild() == null
            || outlineHierarchy.getLastChild() == null) {
          result.add(new ValidationError(ERROR_SYNTAX_TRAILER_OUTLINES_INVALID,
              "Outline Hierarchy doesn't have First and/or Last entry(ies)"));
        } else {
          // ---- Count entry is mandatory if there are childrens
          if (!isCountEntryPresent(outlineHierarchy.getCOSDictionary())) {
            result.add(new ValidationError(
                ERROR_SYNTAX_TRAILER_OUTLINES_INVALID,
                "Outline Hierarchy doesn't have Count entry"));
          } else {
            exploreOutlineLevel(outlineHierarchy.getFirstChild(), handler,
                result);
          }
        }
      }
    } else {
      throw new ValidationException(
          "There are no Catalog entry in the Document.");
    }
    return result;
  }
