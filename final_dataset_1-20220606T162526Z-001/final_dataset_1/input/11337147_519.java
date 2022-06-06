@Override
    public ApplicationPageItem add(final ApplicationPageItem item) {
        try {
            final ApplicationPage applicationPage = applicationAPI.createApplicationPage(item.getApplicationId().toLong(), item.getPageId().toLong(),
                    item.getToken());
            return converter.toApplicationPageItem(applicationPage);
        } catch (final Exception e) {
            throw new APIException(e);
        }
    }
