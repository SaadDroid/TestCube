public String java() {
        return new UncheckedText(
            new FormattedText(
                "new %s(%s)",
                this.name,
                new UncheckedText(
                    new JoinedText(
                        ", ",
                        new Mapped<>(Argument::java, this.args)
                    )
                ).asString()
            )
        ).asString();
    }
