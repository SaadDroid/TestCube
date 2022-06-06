@Override public void writeTo( ResourceBundle resourceBundle, Class<?> type, Type genericType,
                                 Annotation[] annotations, MediaType mediaType,
                                 MultivaluedMap<String, Object> httpHeaders, OutputStream entityStream )
    throws IOException, WebApplicationException {
    if ( MediaType.APPLICATION_JSON_TYPE.equals( mediaType ) ) {
      JSONObject resourceBundleJsonObject = new JSONObject();
      for ( String key : Collections.list( resourceBundle.getKeys() ) ) {
        resourceBundleJsonObject.put( key, resourceBundle.getString( key ) );
      }
      OutputStreamWriter outputStreamWriter = null;
      try {
        outputStreamWriter = new OutputStreamWriter( entityStream, StandardCharsets.UTF_8 );
        resourceBundleJsonObject.writeJSONString( outputStreamWriter );
      } finally {
        if ( outputStreamWriter != null ) {
          outputStreamWriter.flush();
        }
      }
    } else if ( MediaType.APPLICATION_XML_TYPE.equals( mediaType ) ) {
      try {
        Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        Node propertiesNode = document.createElement( "properties" );
        document.appendChild( propertiesNode );
        for ( String key : Collections.list( resourceBundle.getKeys() ) ) {
          Node propertyNode = document.createElement( "property" );
          propertiesNode.appendChild( propertyNode );

          Node keyNode = document.createElement( "key" );
          keyNode.setTextContent( key );
          propertyNode.appendChild( keyNode );

          Node valueNode = document.createElement( "value" );
          valueNode.setTextContent( resourceBundle.getString( key ) );
          propertyNode.appendChild( valueNode );
        }
        Result output = new StreamResult( entityStream );
        Source input = new DOMSource( document );
        try {
          Transformer transformer = TransformerFactory.newInstance().newTransformer();
          transformer.setOutputProperty( OutputKeys.INDENT, "yes" );
          transformer.setOutputProperty( "{http://xml.apache.org/xslt}indent-amount", "2" );
          transformer.transform( input, output );
        } catch ( TransformerException e ) {
          throw new IOException( e );
        }
      } catch ( ParserConfigurationException e ) {
        throw new WebApplicationException( e );
      }
    }
  }
