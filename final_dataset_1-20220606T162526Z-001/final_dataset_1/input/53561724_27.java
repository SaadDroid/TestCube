public Collection<MenuItem> menu() {
        ModelCollectionQuery<MenuItem> query = ModelCollectionQuery.LogicalOperators.and(
                MenuItem.belongsToRestaurant(this), notDeleted(MenuItemAdded.class, MenuItemAdded.ID, MenuItem::lookup));
        return MenuItem.query(getRepository(), query);
    }
