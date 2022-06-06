public Optional<String> parse(String cmdlineFileContents) {
        return Optional.ofNullable(cmdlineFileContents)
            .map(s -> StringUtils.strip(s, ARG_SEPARATOR + "")) // trim nulls from the end before replacing so that args ending in space don't get cut
            .map(s -> s.replace(ARG_SEPARATOR, ARG_SEPARATOR_REPLACEMENT));

    }
