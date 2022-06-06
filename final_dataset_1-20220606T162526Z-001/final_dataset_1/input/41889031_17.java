public static List<SubscriptionItem> readFrom(
            final InputStream in, @Nullable final ImportExportEventListener eventListener)
            throws InvalidSourceException {
        if (in == null) {
            throw new InvalidSourceException("input is null");
        }

        final List<SubscriptionItem> channels = new ArrayList<>();

        try {
            final JsonObject parentObject = JsonParser.object().from(in);

            if (!parentObject.has(JSON_SUBSCRIPTIONS_ARRAY_KEY)) {
                throw new InvalidSourceException("Channels array is null");
            }

            final JsonArray channelsArray = parentObject.getArray(JSON_SUBSCRIPTIONS_ARRAY_KEY);

            if (eventListener != null) {
                eventListener.onSizeReceived(channelsArray.size());
            }

            for (final Object o : channelsArray) {
                if (o instanceof JsonObject) {
                    final JsonObject itemObject = (JsonObject) o;
                    final int serviceId = itemObject.getInt(JSON_SERVICE_ID_KEY, 0);
                    final String url = itemObject.getString(JSON_URL_KEY);
                    final String name = itemObject.getString(JSON_NAME_KEY);

                    if (url != null && name != null && !url.isEmpty() && !name.isEmpty()) {
                        channels.add(new SubscriptionItem(serviceId, url, name));
                        if (eventListener != null) {
                            eventListener.onItemCompleted(name);
                        }
                    }
                }
            }
        } catch (final Throwable e) {
            throw new InvalidSourceException("Couldn't parse json", e);
        }

        return channels;
    }
