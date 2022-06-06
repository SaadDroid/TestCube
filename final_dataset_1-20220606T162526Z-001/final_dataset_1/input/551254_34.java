public static String getTextContent(Node e) {
		StringBuilder sb = new StringBuilder();

		NodeList children = e.getChildNodes();
		if (children != null) {
			for (int i = 0; i < children.getLength(); i++) {
				Node n = children.item(i);
				if (n.getNodeType() == Node.TEXT_NODE) {
					sb.append(n.getNodeValue());
				}
			}
		}

		return sb.toString();
	}
