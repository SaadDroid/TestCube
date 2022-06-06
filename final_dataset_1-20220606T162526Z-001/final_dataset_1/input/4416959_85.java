public Link createPageRenderLink(PageRenderRequestParameters parameters)
    {
        StringBuilder builder = new StringBuilder(BUFFER_SIZE);

        // Build up the absolute URI.

        String activePageName = parameters.getLogicalPageName();

        builder.append(contextPath);

        encodeAppFolderAndLocale(builder);

        builder.append(SLASH);

        String encodedPageName = encodePageName(activePageName);

        builder.append(encodedPageName);

        appendContext(encodedPageName.length() > 0, parameters.getActivationContext(), builder);

        Link link = new LinkImpl(builder.toString(), false, requestSecurityManager.checkPageSecurity(activePageName),
                response, contextPathEncoder, baseURLSource);

        if (parameters.isLoopback())
        {
            link.addParameter(TapestryConstants.PAGE_LOOPBACK_PARAMETER_NAME, "t");
        }

        return link;
    }
