static void writeCanonicalString(
      ClientRequestContext ctx, RequestHeaders headers, HttpData payload, ByteBuf result) {
    // HTTPRequestMethod + '\n' +
    ByteBufUtil.writeUtf8(result, ctx.method().name());
    result.writeByte('\n');

    // CanonicalURI + '\n' +
    // TODO: make this more efficient
    ByteBufUtil.writeUtf8(result,
        ctx.path().replace("*", "%2A").replace(",", "%2C").replace(":", "%3A"));
    result.writeByte('\n');

    // CanonicalQueryString + '\n' +
    String query = ctx.query();
    if (query != null) {
      ByteBufUtil.writeUtf8(result, query);
    }
    result.writeByte('\n');

    // CanonicalHeaders + '\n' +
    ByteBuf signedHeaders = ctx.alloc().buffer();

    writeCanonicalHeaderValue(HOST, host(headers, ctx), signedHeaders, result);
    try {
      for (AsciiString canonicalHeader : OTHER_CANONICAL_HEADERS) {
        String value = headers.get(canonicalHeader);
        if (value != null) {
          writeCanonicalHeaderValue(canonicalHeader, value, signedHeaders, result);
        }
      }
      result.writeByte('\n'); // end headers

      // SignedHeaders + '\n' +
      signedHeaders.readByte(); // throw away the first semicolon
      result.writeBytes(signedHeaders);
    } finally {
      signedHeaders.release();
    }
    result.writeByte('\n');

    // HexEncode(Hash(Payload))
    if (!payload.isEmpty()) {
      ByteBufUtil.writeUtf8(result, ByteBufUtil.hexDump(sha256(payload)));
    } else {
      ByteBufUtil.writeUtf8(result, EMPTY_STRING_HASH);
    }
  }
