@Override
    public Iterator<Token> iterateTokens(final String text) {

        final Iterator<String> tokens = Twokenize.tokenizeRawTweetText(text).iterator();
        return new AbstractIterator<Token>() {

            int endPosition = 0;

            @Override
            protected Token getNext() throws Finished {
                if (tokens.hasNext()) {
                    String token = tokens.next();
                    int startPosition = text.indexOf(token, endPosition);

                    // XXX bugfix, as the tokenizer seems to transform &gt; to > automatically,
                    // so we cannot determine the index for the annotation correctly. In this
                    // case, set it by former endPosition which should be okay. I guess.
                    if (startPosition == -1) {
                        startPosition = endPosition + 1;
                    }

                    endPosition = startPosition + token.length();
                    return new ImmutableToken(startPosition, token);

                }
                throw FINISHED;
            }
        };
    }
