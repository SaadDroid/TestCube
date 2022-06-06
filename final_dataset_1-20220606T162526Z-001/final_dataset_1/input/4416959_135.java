public void handle(PageRenderRequestParameters parameters) throws IOException
    {
        Page page = cache.get(parameters.getLogicalPageName());

        if (request.getAttribute(InternalConstants.BYPASS_ACTIVATION) == null)
        {
            if (pageActivator.activatePage(page.getRootElement().getComponentResources(),
                    parameters.getActivationContext(), resultProcessor))
            {
                return;
            }

            if (!parameters.isLoopback())
            {
                page.pageReset();
            }
        }

        pageResponseRenderer.renderPageResponse(page);
    }
