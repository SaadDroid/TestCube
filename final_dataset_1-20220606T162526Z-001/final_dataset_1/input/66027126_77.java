@Override
    public Iterable<Pair<Token, CharSequence>> parameters()
    {
        final CharSequence algorithm = new Backed<>(mDigestChallenge.parameter(Tokens.ALGORITHM), "MD5").value();
        final MessageDigestFactory digestFactory = new DigestFactory(algorithm.toString());
        final Optional<CharSequence> userhash = mDigestChallenge.parameter(Tokens.USERHASH);
        final CharSequence realm = mDigestChallenge.parameter(Tokens.REALM).value();
        final CharSequence nonce = mDigestChallenge.parameter(Tokens.NONCE).value();

        final CharSequence username = mUserCredentials.userName();
        CharSequence user = new Mapped<CharSequence, CharSequence>(
                argument -> new Hex(new Digest(digestFactory, username, ":", realm).value()),
                new Sieved<>(argument -> "true".equalsIgnoreCase(argument.toString()), userhash)).value(username);

        return new Joined<>(
                new Seq<>(
                        new Parameter(Tokens.USERNAME, new Quoted(user)),
                        new Parameter(Tokens.REALM, new Quoted(realm)),
                        new Parameter(Tokens.NONCE, new Quoted(nonce)),
                        new Parameter(Tokens.URI, new Quoted(mRequestUri.getRawPath())),
                        new Parameter(Tokens.QOP, "auth"),
                        new Parameter(Tokens.NC, new Hex(bigEndianByteArray(mNonceCount))),
                        new Parameter(Tokens.CNONCE, new Quoted(mCnonce)),
                        new Parameter(Tokens.ALGORITHM, algorithm),
                        new Parameter(Tokens.RESPONSE, new Quoted(
                                new Hex(new Digest(digestFactory,
                                        new Hex(new Digest(digestFactory,
                                                mUserCredentials.userName(),
                                                ":",
                                                realm,
                                                ":",
                                                mUserCredentials.password()).value()),
                                        ":",
                                        nonce,
                                        ":",
                                        new Hex(bigEndianByteArray(mNonceCount)),
                                        ":",
                                        mCnonce,
                                        ":auth:",
                                        new Hex(new Digest(digestFactory,
                                                (CharSequence) mMethod.verb(),
                                                ":",
                                                mRequestUri.getRawPath()).value())
                                ).value())))),
                new PresentValues<>(
                        new Mapped<>(charSequence -> new Parameter(Tokens.OPAQUE, new Quoted(charSequence)), mDigestChallenge.parameter(Tokens.OPAQUE)),
                        new Mapped<>(argument -> new Parameter(Tokens.USERHASH, argument), mDigestChallenge.parameter(Tokens.USERHASH))));
    }
