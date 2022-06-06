public Link createComponentEventLink(Page page, String nestedId, String eventType, boolean forForm,
            Object... eventContext)
    {
        assert page != null;
        assert InternalUtils.isNonBlank(eventType);

        Page activePage = pageRenderQueue.getRenderingPage();

        // See TAPESTRY-2184
        if (activePage == null)
            activePage = page;

        String activePageName = activePage.getName();

        Object[] pageActivationContext = contextCollector.collectPageActivationContext(activePageName);

        ComponentEventRequestParameters parameters = new ComponentEventRequestParameters(activePageName,
                page.getName(), toBlank(nestedId), eventType,
                new ArrayEventContext(typeCoercer, pageActivationContext), new ArrayEventContext(typeCoercer,
                        eventContext));

        Link link = linkEncoder.createComponentEventLink(parameters, forForm);

        for (LinkCreationListener2 listener : listeners)
            listener.createdComponentEventLink(link, parameters);

        return link;
    }
