@Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        if (name != null) {
            builder.append("Player: ").append(name).append('\n');
        }

        if (type != null) {
            builder.append("Character type: ").append(type.name()).append('\n');
        }

        builder.append("Stats:\n");
        for (Stats stat : Stats.values()) {
            Integer value = this.get(stat);
            if (value == null) {
                continue;
            }
            builder.append(" - ").append(stat.name()).append(':').append(value).append('\n');
        }
        return builder.toString();
    }
