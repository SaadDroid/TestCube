public String getParameterDefault(String name) {
        Element el = getElementById(name);
        if (LOG.isLoggable(Level.FINE)) {
            LOG.fine("Element with id " + name + " is " + el);
        }
        if (el != null) {
            if (LOG.isLoggable(Level.FINE)) {
                LOG.fine("local name is " + el.getLocalName());
            }
            if ("argument".equals(el.getLocalName())) {
                if (el.hasAttribute("default")) {
                    return el.getAttribute("default");
                }
            } else if ("option".equals(el.getLocalName())) {
                List<Element> elemList =
                    DOMUtils.findAllElementsByTagNameNS(el,
                                                        "http://cxf.apache.org/Xpipe/ToolSpecification",
                                                        "associatedArgument");
                if (!elemList.isEmpty()) {
                    Element assArg = elemList.get(0);
                    if (assArg.hasAttribute("default")) {
                        return assArg.getAttribute("default");
                    }
                }
            }
        }
        return null;
    }
