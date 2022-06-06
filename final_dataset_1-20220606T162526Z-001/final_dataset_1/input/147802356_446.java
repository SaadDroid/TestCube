public <T> Bytes encodeRequest(T request) {
    return encoding.encodePayload(request);
  }
