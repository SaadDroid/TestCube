public List<Handler> buildHandlerChainFromConfiguration(PortComponentHandlerType hc) {
        if (null == hc) {
            return null;
        }
        return sortHandlers(buildHandlerChain(hc, getHandlerClassLoader()));
    }
