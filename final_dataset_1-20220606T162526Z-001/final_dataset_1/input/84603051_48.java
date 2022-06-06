@Override
    public void onResponse(Object response, CoordinationMember from) {
        Map<CoordinationMember, Object> responsesCopy = null;

        synchronized (responses) {
            responses.put(from, response);

            if (responses.size() == expected) {
                responsesCopy = new HashMap<>(responses);
            }
        }

        if (responsesCopy != null && completed.compareAndSet(false, true)) {
            callback.onResponses(responsesCopy);
        }
    }
