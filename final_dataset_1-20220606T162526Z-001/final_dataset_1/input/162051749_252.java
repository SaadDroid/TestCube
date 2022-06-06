@Override
    public List<MetaDate> getDates(Document document) {
        List<MetaDate> dates = new ArrayList<MetaDate>();

        List<Node> metaNodes = XPathHelper.getXhtmlNodes(document, "//head/meta");
        for (Node metaNode : metaNodes) {
            NamedNodeMap nodeAttributes = metaNode.getAttributes();
            Node nameAttribute = getNameAttribute(nodeAttributes);
            Node contentAttribute = nodeAttributes.getNamedItem("content");
            if (nameAttribute == null || contentAttribute == null) {
                continue;
            }
            String keyword = KeyWords.searchKeyword(nameAttribute.getNodeValue(), KeyWords.HEAD_KEYWORDS);
            if (keyword == null) {
                continue;
            }
            ExtractedDate date = DateParser.findDate(contentAttribute.getNodeValue(), RegExp.HTML_HEAD_DATES);
            if (date == null) {
                continue;
            }
            dates.add(new MetaDate(date, keyword));
        }

        return dates;
    }
