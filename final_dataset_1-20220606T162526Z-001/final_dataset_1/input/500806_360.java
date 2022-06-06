public static Node findNodeByName(Document doc, String pathExpression) {
        final StringTokenizer tok = new StringTokenizer(pathExpression, ".");
        final int numToks = tok.countTokens();
        NodeList elements;
        if (numToks == 1) {
            elements = doc.getElementsByTagNameNS("*", pathExpression);
            return elements.item(0);
        }

        String element = pathExpression.substring(pathExpression.lastIndexOf('.')+1);
        elements = doc.getElementsByTagNameNS("*", element);

        String attributeName = null;
        if (elements.getLength() == 0) {
            //No element found, but maybe we are searching for an attribute
            attributeName = element;

            //cut off attributeName and set element to next token and continue
            Node found = findNodeByName(doc, pathExpression.substring(0, pathExpression.length() - attributeName.length() - 1));

            if (found != null) {
                return found.getAttributes().getNamedItem(attributeName);
            } else {
                return null;
            }
        }

        StringBuffer pathName;
        Node parent;
        for (int j=0; j<elements.getLength(); j++) {
            int cnt = numToks-1;
            pathName = new StringBuffer(element);
            parent = elements.item(j).getParentNode();
            do {
                if (parent != null) {
                    pathName.insert(0, '.');
                    pathName.insert(0, parent.getLocalName());//getNodeName());

                    parent = parent.getParentNode();
                }
            } while (parent != null && --cnt > 0);
            if (pathName.toString().equals(pathExpression)) {return elements.item(j);}
        }

        return null;
    }
