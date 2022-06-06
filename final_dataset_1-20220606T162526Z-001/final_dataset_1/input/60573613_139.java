public static String toItemsString(final List<Integer> items) {
        return items.isEmpty() ? "" : Joiner.on(ItemUtils.DELIMITER).join(items);
    }
