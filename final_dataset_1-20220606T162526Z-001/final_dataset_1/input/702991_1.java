public List<ValidationError> validateMetadataSynchronization(PDDocument document, XMPMetadata metadata) 
  throws ValidationException {
    List<ValidationError> ve = new ArrayList<ValidationError>();

    if (document == null) {
      throw new ValidationException("Document provided is null");
    } else {
      PDDocumentInformation dico = document.getDocumentInformation();
      if (metadata == null) {
        throw new ValidationException("Metadata provided are null");
      } else {
        DublinCoreSchema dc = metadata.getDublinCoreSchema();

        // TITLE
        analyzeTitleProperty(dico, dc, ve);
        // AUTHOR
        analyzeAuthorProperty(dico, dc, ve);
        // SUBJECT
        analyzeSubjectProperty(dico, dc, ve);

        AdobePDFSchema pdf = metadata.getAdobePDFSchema();

        // KEYWORDS
        analyzeKeywordsProperty(dico, pdf, ve);
        // PRODUCER
        analyzeProducerProperty(dico, pdf, ve);

        XMPBasicSchema xmp = metadata.getXMPBasicSchema();

        // CREATOR TOOL
        analyzeCreatorToolProperty(dico, xmp, ve);

        // CREATION DATE
        analyzeCreationDateProperty(dico, xmp, ve);

        // MODIFY DATE
        analyzeModifyDateProperty(dico, xmp, ve);

      }

    }
    return ve;
  }
