@Override
    public String process(String string) {
        if (xPathExpressions.isEmpty()) {
            return string;
        }
        InputStream stream = new ByteArrayInputStream(string.getBytes());
        try {
            Document document = documentBuilderFactory.newDocumentBuilder().parse(stream);
            XPath xPath = xPathfactory.newXPath();
            for (String xPathExpression : xPathExpressions) {
                NodeList nodeList = (NodeList) xPath.compile(xPathExpression).evaluate(document, XPathConstants.NODESET);
                for (int a = 0; a < nodeList.getLength(); a++) {
                    nodeList.item(a).setTextContent(replacement);
                }
            }
            StringWriter writer = new StringWriter();
            Transformer transformer = transformerFactory.newTransformer();
            for (Map.Entry<String, String> entry : outputProperties.entrySet()) {
                transformer.setOutputProperty(entry.getKey(), entry.getValue());
            }
            transformer.transform(new DOMSource(document), new StreamResult(writer));
            return writer.getBuffer().toString();
        } catch (ParserConfigurationException | SAXException | IOException | XPathExpressionException | TransformerException e) {
            throw new IllegalArgumentException(e);
        }
    }
