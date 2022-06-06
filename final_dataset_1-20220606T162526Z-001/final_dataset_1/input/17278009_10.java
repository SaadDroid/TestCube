public Set<ResourceType> apply(InventoryReport report) {
        Set<ResourceType> resourceTypes = getResourceTypes(report.getAddedRoots());
        Set<ResourceType> staleTypes = new HashSet<ResourceType>();

        for (ResourceType type : resourceTypes) {
            // We check two things to determine whether a report should be rejected. First we check
            // that the plugin from which the type comes is installed. We check that the plugin is
            // installed as opposed to checking that it is deleted because the plugin could also
            // be purged in which case checking against deleted plugins wouldn't catch it. Secondly,
            // we check to see if the type is a deleted type. Here we check against deleted types
            // instead of installed types because the number of deleted types at any given time
            // should be much smaller than the number of installed types, resulting in faster look
            // ups. If we have a stale type in the report and that type has already been purged from
            // the database, it will get flagged by the check against installed plugins.
            if (!installedPlugins.contains(type.getPlugin()) ||
                deletedTypes.contains(type.getName() + "::" + type.getPlugin())) {
                staleTypes.add(type);
            }
        }
        return staleTypes;
    }
