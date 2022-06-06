protected void addLongFilterToSearchBuilder(final Map<String, String> filters, final SearchOptionsBuilder builder, final String filterName,
            final String engineAttributeName) {
        if (filters != null && filters.containsKey(filterName)) {
            final String filterValue = filters.get(filterName);
            if (filterValue != null) {
                if (filterValue.startsWith(">")) {
                    builder.greaterThan(engineAttributeName, Long.valueOf(getFilterValueWithoutFirstCharacter(filterValue)));
                } else if (filterValue.startsWith("<")) {
                    builder.lessThan(engineAttributeName, Long.valueOf(getFilterValueWithoutFirstCharacter(filterValue)));
                } else {
                    builder.filter(engineAttributeName, Long.valueOf(filterValue));
                }
            }
        }
    }
