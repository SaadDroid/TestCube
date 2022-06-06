@Override
    public SseEventSink createContext(Message message) {
        final HttpServletRequest request = (HttpServletRequest)message.get(AbstractHTTPDestination.HTTP_REQUEST);
        if (request == null) {
            throw new IllegalStateException("Unable to retrieve HTTP request from the context");
        }

        final MessageBodyWriter<OutboundSseEvent> writer = new OutboundSseEventBodyWriter(
            ServerProviderFactory.getInstance(message), message.getExchange());

        final AsyncResponse async = new AsyncResponseImpl(message);
        final Integer bufferSize = PropertyUtils.getInteger(message, SseEventSinkImpl.BUFFER_SIZE_PROPERTY);
        
        final SseEventSink sink = createSseEventSink(request, writer, async, bufferSize);
        message.put(SseEventSink.class, sink);
        
        return sink;
    }
