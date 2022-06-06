public Schema2 newSchema(SAXSource source) throws SAXException {
    Resolver resolver = null;
    LSResourceResolver resourceResolver = getResourceResolver();
    if (resourceResolver != null)
      resolver = LS.createResolver(resourceResolver);
    SAXResolver saxResolver = new SAXResolver(resolver);
    ErrorHandler eh = getErrorHandler();
    if (eh == null)
      eh = new DraconianErrorHandler();
    Parseable<Pattern, NameClass, Locator, VoidValue, CommentListImpl, AnnotationsImpl> parseable
            = createParseable(source, saxResolver, eh);
    SchemaPatternBuilder spb = new SchemaPatternBuilder();
    try {
      return new SchemaImpl(this, spb, SchemaBuilderImpl.parse(parseable, eh, getDatatypeLibraryFactory(), spb, false));
    }
    catch (IOException io) {
      // this is a truly bizarre API; why can't we just throw the IOException
      SAXParseException e = new SAXParseException(io.getMessage(), null, io);
      eh.fatalError(e);
      throw e;
    }
    catch (IllegalSchemaException e) {
      // we have already reported something for this error, so don't give it to the error handler
      throw new SAXException("invalid schema");
    }
  }
