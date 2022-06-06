public Set<Class> getHandledRenderPhases()
    {
        Set<Class> result = CollectionFactory.newSet();

        if (parentModel != null)
            result.addAll(parentModel.getHandledRenderPhases());

        if (handledRenderPhases != null)
            result.addAll(handledRenderPhases);

        return result;
    }
