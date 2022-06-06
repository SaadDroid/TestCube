public List<String> getOutstreamIds() {
        List<String> res = new ArrayList<>();
        Element streams = getStreams();

        if (streams != null) {
            List<Element> elemList = DOMUtils.findAllElementsByTagNameNS(streams,
                                                                         Tool.TOOL_SPEC_PUBLIC_ID,
                                                                         "outstream");

            for (Element elem : elemList) {
                res.add(elem.getAttribute("id"));
            }
        }
        return Collections.unmodifiableList(res);
    }
