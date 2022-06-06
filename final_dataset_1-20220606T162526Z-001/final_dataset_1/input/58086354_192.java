@Override
  public void sendHeaders(Metadata headers) {
    checkState(!sendHeadersCalled, "sendHeaders has already been called");
    checkState(!closeCalled, "call is closed");

    headers.removeAll(MESSAGE_ENCODING_KEY);
    if (compressor == null) {
      compressor = Codec.Identity.NONE;
      if (inboundHeaders.containsKey(MESSAGE_ACCEPT_ENCODING_KEY)) {
        String acceptEncodings = inboundHeaders.get(MESSAGE_ACCEPT_ENCODING_KEY);
        for (String acceptEncoding : ACCEPT_ENCODING_SPLITER.split(acceptEncodings)) {
          Compressor c = compressorRegistry.lookupCompressor(acceptEncoding);
          if (c != null) {
            compressor = c;
            break;
          }
        }
      }
    } else {
      if (inboundHeaders.containsKey(MESSAGE_ACCEPT_ENCODING_KEY)) {
        String acceptEncodings = inboundHeaders.get(MESSAGE_ACCEPT_ENCODING_KEY);
        List<String> acceptedEncodingsList = ACCEPT_ENCODING_SPLITER.splitToList(acceptEncodings);
        if (!acceptedEncodingsList.contains(compressor.getMessageEncoding())) {
          // resort to using no compression.
          compressor = Codec.Identity.NONE;
        }
      } else {
        compressor = Codec.Identity.NONE;
      }
    }
    inboundHeaders = null;
    if (compressor != Codec.Identity.NONE) {
      headers.put(MESSAGE_ENCODING_KEY, compressor.getMessageEncoding());
    }
    stream.setCompressor(compressor);

    headers.removeAll(MESSAGE_ACCEPT_ENCODING_KEY);
    Set<String> acceptEncodings = decompressorRegistry.getAdvertisedMessageEncodings();
    if (!acceptEncodings.isEmpty()) {
      headers.put(MESSAGE_ACCEPT_ENCODING_KEY, ACCEPT_ENCODING_JOINER.join(acceptEncodings));
    }

    // Don't check if sendMessage has been called, since it requires that sendHeaders was already
    // called.
    sendHeadersCalled = true;
    stream.writeHeaders(headers);
  }
