public boolean setHomeView(@NotNull String viewType) {
        if (getRegisteredView(viewType).isPresent()) {
            this.homeView = viewType;
            return true;
        }
        return false;
    }
