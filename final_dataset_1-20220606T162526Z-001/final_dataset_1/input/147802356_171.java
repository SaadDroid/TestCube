static boolean hostIsInAllowlist(final List<String> allowlist, final String hostHeader) {
    return allowlist.stream()
        .anyMatch(allowlistEntry -> allowlistEntry.toLowerCase().equals(hostHeader.toLowerCase()));
  }
