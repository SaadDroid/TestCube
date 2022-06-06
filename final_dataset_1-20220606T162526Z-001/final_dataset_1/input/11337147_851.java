@Override
    public ItemSearchResult<CustomUserInfoItem> search(int page, int resultsByPage, String search, String orders, Map<String, String> filters) {
        check(containsOnly(FILTER_USER_ID, filters), new _("The only mandatory filter is %name%", new Arg("name", FILTER_USER_ID)));
        check(orders.equals(FIX_ORDER), new _("Sorting is not supported by this API"));
        check(search == null, new _("Search terms are not supported by this API"));

        CustomUserInfoEngineClient client = engineClientCreator.create(getEngineSession());
        List<CustomUserInfo> items = client.listCustomInformation(
                Long.parseLong(filters.get(FILTER_USER_ID)),
                page * resultsByPage,
                resultsByPage);

        List<CustomUserInfoItem> information = new ArrayList<CustomUserInfoItem>();
        for (CustomUserInfo item : items) {
            information.add(converter.convert(item));
        }
        return new ItemSearchResult<CustomUserInfoItem>(page, information.size(), client.countDefinitions(), information);
    }
