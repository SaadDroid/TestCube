@Override
    protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response) throws ServletException, IOException {
        try {
            Resource resource = request.getResource();
            ValueMap properties = resource.getValueMap();
            String itemResourceType = properties.get("itemResourceType", String.class);

            String path = properties.get("path", String.class);
            path = expressionResolver.resolve(path, request.getLocale(), String.class, request);

            if (StringUtils.isEmpty(path)) {
                log.warn("Path unavailable");
                return;
            }

            if (CollectionUtils.isEmpty(
                    componentRewriteRuleService.getSlingResourceTypes(request.getResourceResolver()))) {
                // No rules.
                return;
            }


            setDataSource(path, request, itemResourceType);
        } catch (RepositoryException e) {
            log.warn("Unable to list components: {}", e.getMessage());
        }
    }
