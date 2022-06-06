static TimeSpan valueOf(final String value) {
        if (value.isEmpty()) {
            return new TimeSpan(0, TimeUnit.NANOSECONDS);
        }

        final Matcher matcher = PATTERN.matcher(value);

        if (!matcher.matches()) {
            throw new IllegalArgumentException("'" + value + "' is not a valid time span");
        }

        final long amount = Long.parseLong(matcher.group(1));
        final TimeUnit unit = fromName(matcher.group(2));

        return new TimeSpan(amount, unit);
    }
