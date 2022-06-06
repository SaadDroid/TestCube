@Override
    public Input code() {
        return new InputOf(
            new FormattedText(
                "%s\n\npublic final class %s implements %s {\n  %s\n}\n",
                "package eo;",
                this.name,
                new UncheckedText(
                    new JoinedText(", ", this.ifaces)
                ).asString(),
                this.body.java(this.name).replace("\n", "\n  ")
            )
        );
    }
