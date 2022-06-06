static Ratio valueOf(final String value) {
        final Matcher matcher = PATTERN.matcher(value);

        if (!matcher.matches()) {
            throw new IllegalArgumentException("'" + value + "' is not a valid ratio");
        }

        final int amount = Integer.parseInt(matcher.group(1));
        final int total = Optional.ofNullable(matcher.group(2)).map(Integer::parseInt).orElse(amount);

        return new Ratio(amount, total);
    }
