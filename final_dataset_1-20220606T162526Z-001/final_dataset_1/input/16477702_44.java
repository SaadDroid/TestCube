public static List<URI> parseXrdLinkReferencesFor(XmlPullParser parser, String relation) throws IOException, XmlPullParserException, URISyntaxException {
        ParserUtils.forwardToStartElement(parser);
        List<URI> uriList = new ArrayList<>();
        int initialDepth = parser.getDepth();

        loop: while (true) {
            XmlPullParser.TagEvent tag = parser.nextTag();
            switch (tag) {
            case START_ELEMENT:
                String name = parser.getName();
                String namespace = parser.getNamespace();
                String rel = parser.getAttributeValue("rel");

                if (!namespace.equals(XRD_NAMESPACE) || !name.equals("Link") || !rel.equals(relation)) {
                    continue loop;
                }
                String endpointUri = parser.getAttributeValue("href");
                URI uri = new URI(endpointUri);
                uriList.add(uri);
                break;
            case END_ELEMENT:
                if (parser.getDepth() == initialDepth) {
                    break loop;
                }
                break;
            }
        }
        return uriList;
    }
