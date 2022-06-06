public static void zkAsyncCreateFullPathOptimisticRecursive(
        final ZooKeeperClient zkc,
        final String pathToCreate,
        final Optional<String> parentPathShouldNotCreate,
        final byte[] data,
        final List<ACL> acl,
        final CreateMode createMode,
        final AsyncCallback.StringCallback callback,
        final Object ctx) {
        try {
            zkc.get().create(pathToCreate, data, acl, createMode, new AsyncCallback.StringCallback() {
                @Override
                public void processResult(int rc, String path, Object ctx, String name) {

                    if (rc != KeeperException.Code.NONODE.intValue()) {
                        callback.processResult(rc, path, ctx, name);
                        return;
                    }

                    // Since we got a nonode, it means that my parents may not exist
                    // ephemeral nodes can't have children so Create mode is always
                    // persistent parents
                    int lastSlash = pathToCreate.lastIndexOf('/');
                    if (lastSlash <= 0) {
                        callback.processResult(rc, path, ctx, name);
                        return;
                    }
                    String parent = pathToCreate.substring(0, lastSlash);
                    if (parentPathShouldNotCreate.isPresent()
                            && Objects.equal(parentPathShouldNotCreate.get(), parent)) {
                        // we should stop here
                        callback.processResult(rc, path, ctx, name);
                        return;
                    }
                    zkAsyncCreateFullPathOptimisticRecursive(zkc, parent, parentPathShouldNotCreate, new byte[0], acl,
                            CreateMode.PERSISTENT, new AsyncCallback.StringCallback() {
                                @Override
                                public void processResult(int rc, String path, Object ctx, String name) {
                                    if (rc == KeeperException.Code.OK.intValue()
                                            || rc == KeeperException.Code.NODEEXISTS.intValue()) {
                                        // succeeded in creating the parent, now create the original path
                                        zkAsyncCreateFullPathOptimisticRecursive(zkc, pathToCreate,
                                                parentPathShouldNotCreate, data, acl, createMode, callback, ctx);
                                    } else {
                                        callback.processResult(rc, path, ctx, name);
                                    }
                                }
                            }, ctx);
                }
            }, ctx);
        } catch (ZooKeeperClient.ZooKeeperConnectionException zkce) {
            callback.processResult(DistributedLogConstants.ZK_CONNECTION_EXCEPTION_RESULT_CODE,
                    zkce.getMessage(), ctx, pathToCreate);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
            callback.processResult(DistributedLogConstants.DL_INTERRUPTED_EXCEPTION_RESULT_CODE,
                    ie.getMessage(), ctx, pathToCreate);
        }
    }
