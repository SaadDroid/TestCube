public String findMaxPrefix(final String path) {
         Objects.requireNonNull(path, "Path cannot be null");

         final String[] pathComponents = split(path);

         readLock.lock();
         try {
             TrieNode parent = rootNode;
             TrieNode deepestPropertyNode = null;
             for (final String element : pathComponents) {
                 parent = parent.getChild(element);
                 if (parent == null) {
                     LOG.debug("{}", element);
                     break;
                 }
                 if (parent.hasProperty()) {
                     deepestPropertyNode = parent;
                 }
             }

             if (deepestPropertyNode == null) {
                 return "/";
             }

             final Deque<String> treePath = new ArrayDeque<>();
             TrieNode node = deepestPropertyNode;
             while (node != this.rootNode) {
                 treePath.offerFirst(node.getValue());
                 node = node.parent;
             }
             return "/" + String.join("/", treePath);
         } finally {
             readLock.unlock();
         }
     }
