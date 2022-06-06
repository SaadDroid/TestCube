String percentEncodeNextLink(final String link) {
    if (link == null) {
      return null;
    }

    return link.replaceAll("\\$skiptoken=.+?(?:&|$)", "")
        .replaceAll("\\$skipApplied=.+?(?:&|$)", "")
        .replaceFirst("(?:\\?|&)$", ""); // Remove potentially trailing "?" or "&" left over from remove actions
  }
