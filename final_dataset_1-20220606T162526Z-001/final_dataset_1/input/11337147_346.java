public String getApplicationLayoutName() throws PageNotFoundException {
        return pageApi.getPage(application.getLayoutId()).getName();
    }
