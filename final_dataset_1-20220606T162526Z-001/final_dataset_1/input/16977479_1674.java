public List<Handler> buildHandlerChainFromClass(Class<?> clz, List<Handler> existingHandlers,
                                                    QName portQName, QName serviceQName, String bindingID) {
        LOG.fine("building handler chain");
        classLoader = getClassLoader(clz);
        HandlerChainAnnotation hcAnn = findHandlerChainAnnotation(clz, true);
        List<Handler> chain = null;
        if (hcAnn == null) {
            if (LOG.isLoggable(Level.FINE)) {
                LOG.fine("no HandlerChain annotation on " + clz);
            }
            chain = new ArrayList<>();
        } else {
            hcAnn.validate();

            try {

                URL handlerFileURL = resolveHandlerChainFile(clz, hcAnn.getFileName());
                if (handlerFileURL == null) {
                    throw new WebServiceException(new Message("HANDLER_CFG_FILE_NOT_FOUND_EXC", BUNDLE, hcAnn
                        .getFileName()).toString());
                }

                Document doc = StaxUtils.read(handlerFileURL.openStream());
                Element el = doc.getDocumentElement();
                if (!"http://java.sun.com/xml/ns/javaee".equals(el.getNamespaceURI())
                    || !"handler-chains".equals(el.getLocalName())) {

                    String xml = StaxUtils.toString(el);
                    throw new WebServiceException(
                        BundleUtils.getFormattedString(BUNDLE,
                                                       "NOT_VALID_ROOT_ELEMENT",
                                                       "http://java.sun.com/xml/ns/javaee"
                                                           .equals(el.getNamespaceURI()),
                                                       "handler-chains".equals(el.getLocalName()),
                                                       xml, handlerFileURL));
                }
                chain = new ArrayList<>();
                Node node = el.getFirstChild();
                while (node != null) {
                    if (node instanceof Element) {
                        el = (Element)node;
                        if (!"http://java.sun.com/xml/ns/javaee".equals(el.getNamespaceURI())
                            || !"handler-chain".equals(el.getLocalName())) {

                            String xml = StaxUtils.toString(el);
                            throw new WebServiceException(
                                BundleUtils.getFormattedString(BUNDLE,
                                                               "NOT_VALID_ELEMENT_IN_HANDLER",
                                                               xml));
                        }
                        processHandlerChainElement(el, chain,
                                                   portQName, serviceQName, bindingID);
                    }
                    node = node.getNextSibling();
                }
            } catch (WebServiceException e) {
                throw e;
            } catch (Exception e) {
                throw new WebServiceException(BUNDLE.getString("CHAIN_NOT_SPECIFIED_EXC"), e);
            }
        }
        assert chain != null;
        if (existingHandlers != null) {
            chain.addAll(existingHandlers);
        }
        return sortHandlers(chain);
    }
