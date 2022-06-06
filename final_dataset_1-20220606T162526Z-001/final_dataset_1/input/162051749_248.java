@Override
    public List<StructureDate> getDates(Document document) {
        Node bodyElement = XPathHelper.getXhtmlNode(document, "//body");
        if (bodyElement != null) {
            return getChildrenDates(bodyElement, 0);
        } else {
            return Collections.emptyList();
        }
    }
