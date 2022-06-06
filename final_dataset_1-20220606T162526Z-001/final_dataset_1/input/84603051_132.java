boolean onReplyFailure(ClusterNode node, Throwable error) {
        synchronized (this) {
            if (errors == null) {
                errors = new HashMap<>(nodes.size(), 1.0f);
            }

            errors.put(node, error);

            return isReady();
        }
    }
