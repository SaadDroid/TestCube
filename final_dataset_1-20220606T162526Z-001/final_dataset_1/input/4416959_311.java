public ComponentTemplate getTemplate(ComponentModel componentModel, ComponentResourceSelector selector)
    {
        String componentName = componentModel.getComponentClassName();

        MultiKey key = new MultiKey(componentName, selector);

        // First cache is key to resource.

        Resource resource = templateResources.get(key);

        if (resource == null)
        {
            resource = locateTemplateResource(componentModel, selector);
            templateResources.put(key, resource);
        }

        // If we haven't yet parsed the template into the cache, do so now.

        ComponentTemplate result = templates.get(resource);

        if (result == null)
        {
            result = parseTemplate(resource);
            templates.put(resource, result);
        }

        return result;
    }
