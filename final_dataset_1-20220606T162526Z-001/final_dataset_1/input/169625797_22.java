@Override
    public Node applyTo(Node root, Set<Node> finalNodes) throws RepositoryException {


        // Remove Design Property.
        if (root.hasProperty(NameConstants.PN_DESIGN_PATH)) {
            root.getProperty(NameConstants.PN_DESIGN_PATH).remove();
        }

        // Remove specified nodes
        List<String> remove = Arrays.asList(componentsToRemove);
        NodeIterator it = root.getNodes();
        while (it.hasNext()) {
            Node child = it.nextNode();
            if (remove.contains(child.getName())) {
                child.remove();
            }
        }

        Property template = root.getProperty(NameConstants.NN_TEMPLATE);
        template.setValue(editableTemplate);
        Property resourceType = root.getProperty(JcrResourceConstants.SLING_RESOURCE_TYPE_PROPERTY);
        resourceType.setValue(slingResourceType);


        Node responsiveGrid = root.addNode(RESPONSIVE_GRID_NODE_NAME, JcrConstants.NT_UNSTRUCTURED);
        responsiveGrid.setProperty(JcrResourceConstants.SLING_RESOURCE_TYPE_PROPERTY,
                RewriteUtils.RESPONSIVE_GRID_RES_TYPE);

        // First Copy the Root children over
        List<String> names = moveStructure(root, responsiveGrid, nested);
        // Copy & Create any nested
        for (String key : componentOrdering.keySet()) {

            // Ignore root, it'll be handled after everything is copied.
            if (RESPONSIVE_GRID_NODE_NAME.equals(key)) {
                continue;
            }

            if (!responsiveGrid.hasNode(key)) {
                Node child = responsiveGrid.addNode(key, JcrConstants.NT_UNSTRUCTURED);
                child.setProperty(JcrResourceConstants.SLING_RESOURCE_TYPE_PROPERTY, RewriteUtils.RESPONSIVE_GRID_RES_TYPE);
            }
            Node child = responsiveGrid.getNode(key);
            List<String> cn = moveStructure(root, child, names);
            reorderChildren(cn, componentOrdering.get(key), child);
        }

        reorderChildren(names, componentOrdering.get(RESPONSIVE_GRID_NODE_NAME), responsiveGrid);

        return root;
    }
