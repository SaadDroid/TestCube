@VisibleForTesting
  static Set<IpProtocol> parseIpProtocols(JsonNode ipProtocols) {
    String input = "";
    if (ipProtocols == null || ipProtocols.isNull()) {
      return null;
    } else if (ipProtocols.isTextual()) {
      input = ipProtocols.asText();
    } else if (ipProtocols.isArray()) {
      input =
          Streams.stream(ipProtocols.elements())
              .map(JsonNode::textValue)
              .collect(Collectors.joining(","));
    } else {
      throw new IllegalArgumentException(
          String.format(
              "IP protocol specifier should be a string or a list of strings. Got: %s",
              ipProtocols));
    }

    return SpecifierFactories.getIpProtocolSpecifierOrDefault(
            input, NoIpProtocolsIpProtocolSpecifier.INSTANCE)
        .resolve();
  }
