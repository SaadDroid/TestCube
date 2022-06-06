@Override
    // CAUTION: Method has more than one exit point.
    public String combineValues(final List<String> maybeValues) {
        return Optional.ofNullable(maybeValues)
                .map(values -> StringUtils.join(values.stream().filter(val -> !Strings.isNullOrEmpty(val)).collect(Collectors.toList()), ", "))
                .orElse("");
    }
