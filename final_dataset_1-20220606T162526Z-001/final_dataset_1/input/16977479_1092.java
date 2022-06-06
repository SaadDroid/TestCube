public synchronized ContextHandler getContextHandler(URL url) {
        String contextName = HttpUriMapper.getContextName(url.getPath());
        ContextHandler ret = null;
        // After a stop(), the server is null, and therefore this
        // operation should return null.
        if (server != null) {
            for (Handler handler : server.getChildHandlersByClass(ContextHandler.class)) {
                ContextHandler contextHandler = null;
                if (handler instanceof ContextHandler) {
                    contextHandler = (ContextHandler) handler;
                    if (contextName.equals(contextHandler.getContextPath())) {
                        ret = contextHandler;
                        break;
                    }
                }
            }
        }
        return ret;
    }
