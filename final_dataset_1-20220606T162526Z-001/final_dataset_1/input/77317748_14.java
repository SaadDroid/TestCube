static Node getChildNodeByTagName(Node node, String name) {
        NodeList children = node.getChildNodes();
        if (children != null && children.getLength() > 0) {
            for (int i = 0; i < children.getLength(); i++) {
                Node child = children.item(i);
                if (child instanceof Element) {
                    Element element = (Element) child;
                    if (name.equals(element.getTagName())) {
                        return element;
                    }
                }
            }
        }
        return null;
    }
