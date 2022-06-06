public void compile() throws IOException {
        final String[] lines = new TextOf(this.input).asString().split("\n");
        final ANTLRErrorListener errors = new BaseErrorListener() {
            // @checkstyle ParameterNumberCheck (10 lines)
            @Override
            public void syntaxError(final Recognizer<?, ?> recognizer,
                final Object symbol, final int line,
                final int position, final String msg,
                final RecognitionException error) {
                throw new CompileException(
                    String.format(
                        "[%d:%d] %s: \"%s\"",
                        line, position, msg, lines[line - 1]
                    ),
                    error
                );
            }
        };
        final org.eolang.compiler.ProgramLexer lexer =
            new org.eolang.compiler.ProgramLexer(
                CharStreams.fromStream(this.input.stream())
            );
        lexer.removeErrorListeners();
        lexer.addErrorListener(errors);
        final org.eolang.compiler.ProgramParser parser =
            new org.eolang.compiler.ProgramParser(
                new CommonTokenStream(lexer)
            );
        parser.removeErrorListeners();
        parser.addErrorListener(errors);
        final Tree tree = parser.program().ret;
        new IoCheckedScalar<>(
            new And(
                path -> {
                    new LengthOf(
                        new TeeInput(
                            path.getValue(),
                            this.target.apply(path.getKey())
                        )
                    ).value();
                },
                tree.java().entrySet()
            )
        ).value();
    }
