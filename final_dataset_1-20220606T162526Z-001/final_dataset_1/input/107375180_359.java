@SuppressWarnings("unchecked")
    private static void setDataProvider(HasItems<?> component, ListDataProvider<Object> listDataProvider) {
        if (component instanceof HasDataProvider) {
            ((HasDataProvider<Object>)component).setDataProvider(listDataProvider);
        } else if (component instanceof ComboBox) {
            ((ComboBox<Object>)component).setDataProvider(listDataProvider);
        } else if (component instanceof HasFilterableDataProvider) {
            ((HasFilterableDataProvider<Object, SerializablePredicate<Object>>)component)
                    .setDataProvider(listDataProvider);
        }
    }
