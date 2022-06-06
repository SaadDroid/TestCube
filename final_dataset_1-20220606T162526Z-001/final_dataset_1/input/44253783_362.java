@Override
  public Document create(Exception e, String workflow, String location) throws Exception {
    // Just use XStream as the marshaller, if we let them configure it, someone might configure
    // a XStreamJSON which would be quite bad.
    AdaptrisMarshaller m = new XStreamMarshaller();
    ExceptionReport report = createReportObject(e, workflow, location);
    return createDocument(m.marshal(report), (DocumentBuilderFactoryBuilder) null);
  }
