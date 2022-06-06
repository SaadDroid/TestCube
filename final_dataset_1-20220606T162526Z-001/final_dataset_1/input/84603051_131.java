boolean onReplySuccess(ClusterNode node, Response<T> rsp) {
        synchronized (this) {
            results.put(node, rsp.payload());

            return isReady();
        }
    }
