public void processResultValue(Component value) throws IOException
    {
        ComponentResources resources = value.getComponentResources();

        boolean isPage = value == resources.getPage();

        String pageName = resources.getPageName();

        if (isPage)
        {
            // This will ultimately send a JSON response to redirect to the page

            masterProcessor.processResultValue(pageName);
            return;
        }

        // Otherwise, a component within a page. Components are transformed to implement RenderCommand, but if we just
        // pass the component itself to the master processor, we'll get in a loop, so we instead
        // pass the ComponentPageElement (which implements RenderCommand as well).

        Page page = cache.get(pageName);

        String nestedId = resources.getNestedId();

        RenderCommand command = page.getComponentElementByNestedId(nestedId);

        masterProcessor.processResultValue(command);
    }
