public static ArrayList<String> groupToPages(Triple<String, GoogleWebmasterFilter.FilterOperator, UrlTrieNode> group) {
    ArrayList<String> ret = new ArrayList<>();
    if (group.getMiddle().equals(GoogleWebmasterFilter.FilterOperator.EQUALS)) {
      if (group.getRight().isExist()) {
        ret.add(group.getLeft());
      }
    } else if (group.getMiddle().equals(GoogleWebmasterFilter.FilterOperator.CONTAINS)) {
      UrlTrie trie = new UrlTrie(group.getLeft(), group.getRight());
      Iterator<Pair<String, UrlTrieNode>> iterator = new UrlTriePostOrderIterator(trie, 1);
      while (iterator.hasNext()) {
        Pair<String, UrlTrieNode> next = iterator.next();
        if (next.getRight().isExist()) {
          ret.add(next.getLeft());
        }
      }
    }
    return ret;
  }
