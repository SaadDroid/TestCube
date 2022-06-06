public void deletePath(final String path) {
         Objects.requireNonNull(path, "Path cannot be null");

         if (path.length() == 0) {
             throw new IllegalArgumentException("Invalid path: " + path);
         }
         final String[] pathComponents = split(path);


         writeLock.lock();
         try {
             TrieNode parent = rootNode;
             for (final String part : pathComponents) {
                 if (parent.getChild(part) == null) {
                     // the path does not exist
                     return;
                 }
                 parent = parent.getChild(part);
                 LOG.debug("{}", parent);
             }

             final TrieNode realParent = parent.getParent();
             realParent.deleteChild(parent.getValue());
         } finally {
             writeLock.unlock();
         }
     }
