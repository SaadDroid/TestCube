@Override
    public Document parse(InputSource inputSource) throws ParserException {
        DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();

        try {
            // added by Philipp, 2011-01-28
            docBuilderFactory.setNamespaceAware(true);

            DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
            return docBuilder.parse(inputSource);
        } catch (ParserConfigurationException e) {
            throw new ParserException(e);
        } catch (IOException e) {
            throw new ParserException(e);
        } catch (SAXException e) {
            throw new ParserException(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ParserException(e);
        } catch (Throwable th) {
            throw new ParserException(th);
        }
    }
