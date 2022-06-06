@NonNull
    public List<AutoModFlag> parseFlags(@NonNull String rawFlags) {
        final String[] splitFlags = rawFlags.split(",");
        final List<AutoModFlag> flags = new ArrayList<>(splitFlags.length);

        for (String rawFlag : splitFlags) {
            String[] parts = rawFlag.split(":", -1);
            if (parts.length != 2)
                continue;

            String[] indices = parts[0].split("-");
            if (indices.length != 2)
                continue;
            int start = Integer.parseInt(indices[0]);
            int end = Integer.parseInt(indices[1]);

            AutoModFlag.AutoModFlagBuilder builder = AutoModFlag.builder()
                .startIndex(start)
                .endIndex(end);

            String[] scores = parts[1].split("/");
            for (String score : scores) {
                String[] scoreParts = score.split("\\.");
                if (scoreParts.length != 2)
                    continue;
                FlagType type = FlagType.parse(scoreParts[0]);
                if (type != null)
                    builder.score(type, Integer.parseInt(scoreParts[1]));
            }

            flags.add(builder.build());
        }

        return Collections.unmodifiableList(flags);
    }
