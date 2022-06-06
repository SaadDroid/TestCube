public String java() {
        return new UncheckedText(
            new FormattedText(
                "final %s %s",
                this.type,
                this.name
            )
        ).asString();
    }
