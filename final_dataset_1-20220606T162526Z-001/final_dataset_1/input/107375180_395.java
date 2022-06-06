@Override
    @SuppressWarnings({ "unchecked" })
    public Collection<T> getChildren(Object itemId) {
        List<T> newChildren = children.computeIfAbsent((T)itemId, this::getChildrenTypesafe);
        newChildren.forEach(c -> {
            if (!containsId(c)) {
                getAllItemIds().add(c);
            }
        });
        return newChildren;
    }
