@Override
  public void insert(InputStreamWithEncoding data, InterlokMessage m) throws InterlokException
  {
    if (m instanceof MultiPayloadAdaptrisMessage)
    {
      insert(data, m.resolve(getPayloadId()), (MultiPayloadAdaptrisMessage)m);
    }
    else
    {
      throw new InterlokException("Cannot insert payload into message type " + m.getClass().getName() + " as it does not support multiple payloads.");
    }
  }
