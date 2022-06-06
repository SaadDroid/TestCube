Element buildCoverageMarkerMessage(Element msgElement, IActivity a) {
		Document msgDoc = msgElement.getOwnerDocument();
		List<? extends IDocumentation> documentation = a.getDocumentation();

		if (documentation != null && documentation.size() > 0) {
			IDocumentation firstDoc = documentation.get(0);
			for (Node n : firstDoc.getDocumentationElements()) {
				if (isMarkerElement(n)) {
					Element markerElement = msgDoc.createElementNS(
							CoverageConstants.MARKER_SERVICE_NAMESPACE,
							CoverageConstants.COVERAGE_MSG_MARKER_ELEMENT);
					XMLUtil.appendTextNode(markerElement,
							XMLUtil.getTextContent(n));
					msgElement.appendChild(markerElement);
				}
			}
		}
		return msgElement;
	}
