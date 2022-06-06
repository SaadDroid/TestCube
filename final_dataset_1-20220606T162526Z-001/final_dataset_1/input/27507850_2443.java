static void validateType(JsonNode value, Variable variable) throws BatfishException {
    int minLength = variable.getMinLength() == null ? 0 : variable.getMinLength();
    if (value.isTextual() && value.textValue().length() < minLength) {
      throw new BatfishException(
          String.format("Must be at least %s characters in length", minLength));
    }
    Variable.Type expectedType = variable.getType();
    switch (expectedType) {
      case ADDRESS_GROUP_NAME:
        if (!value.isTextual() || value.asText().split(",").length != 2) {
          throw new BatfishException(
              String.format(
                  "A Batfish %s must be a JSON string with two comma-separated values",
                  expectedType.getName()));
        }
        break;
      case ANSWER_ELEMENT:
        // this will barf with JsonProcessingException if the value is not castable
        try {
          BatfishObjectMapper.mapper().treeToValue(value, AnswerElement.class);
        } catch (JsonProcessingException e) {
          throw new BatfishException(
              String.format("Could not cast value to AnswerElement: %s", value), e);
        }
        break;
      case APPLICATION_SPEC:
        if (!value.isTextual()) {
          throw new BatfishException(
              String.format("It is not a valid JSON %s value", expectedType.getName()));
        }
        break;
      case BGP_PEER_PROPERTY_SPEC:
        if (!(value.isTextual())) {
          throw new BatfishException(
              String.format("A Batfish %s must be a JSON string", expectedType.getName()));
        }
        BgpPeerPropertySpecifier.create(value.textValue());
        break;
      case BGP_PROCESS_PROPERTY_SPEC:
        if (!(value.isTextual())) {
          throw new BatfishException(
              String.format("A Batfish %s must be a JSON string", expectedType.getName()));
        }
        BgpProcessPropertySpecifier.create(value.textValue());
        break;
      case BGP_ROUTES:
        if (!(value.isArray())) {
          throw new BatfishException(
              String.format("A Batfish %s must be a JSON array", expectedType.getName()));
        }
        break;
      case BGP_ROUTE_CONSTRAINTS:
        if (!value.isObject() && !value.isNull()) {
          throw new BatfishException(
              String.format(
                  "Not a valid BGP route constraints object: %s", expectedType.getName()));
        }
        break;
      case BGP_SESSION_COMPAT_STATUS_SPEC:
        if (!value.isTextual()) {
          throw new BatfishException(
              String.format("A Batfish %s must be a JSON string", expectedType.getName()));
        }
        break;
      case BGP_SESSION_STATUS_SPEC:
        if (!value.isTextual()) {
          throw new BatfishException(
              String.format("A Batfish %s must be a JSON string", expectedType.getName()));
        }
        break;
      case BGP_SESSION_TYPE_SPEC:
        if (!value.isTextual()) {
          throw new BatfishException(
              String.format("A Batfish %s must be a JSON string", expectedType.getName()));
        }
        break;
      case BOOLEAN:
        if (!value.isBoolean()) {
          throw new BatfishException(
              String.format("It is not a valid JSON %s value", expectedType.getName()));
        }
        break;
      case COMPARATOR:
        if (!(COMPARATORS.contains(value.textValue()))) {
          throw new BatfishException(
              String.format(
                  "It is not a known %s. Valid options are:" + " %s",
                  expectedType.getName(), COMPARATORS));
        }
        break;
      case DOUBLE:
        if (!value.isDouble()) {
          throw new BatfishException(
              String.format("It is not a valid JSON %s value", expectedType.getName()));
        }
        break;
      case DISPOSITION_SPEC:
        if (!value.isTextual()) {
          throw new BatfishException(
              String.format("It is not a valid JSON %s value", expectedType.getName()));
        }
        break;
      case FILTER:
        if (!value.isTextual()) {
          throw new BatfishException(
              String.format("A Batfish %s must be a JSON string", expectedType.getName()));
        }
        break;
      case FILTER_SPEC:
        if (!value.isTextual()) {
          throw new BatfishException(
              String.format("A Batfish %s must be a JSON string", expectedType.getName()));
        }
        break;
      case FLOAT:
        if (!value.isFloat()) {
          throw new BatfishException(
              String.format("It is not a valid JSON %s value", expectedType.getName()));
        }
        break;
      case HEADER_CONSTRAINT:
        if (!value.isObject() && !value.isNull()) {
          throw new BatfishException(
              String.format("Not a valid packet header constraint: %s", expectedType.getName()));
        }
        break;
      case INTEGER:
        if (!value.isInt()) {
          throw new BatfishException(
              String.format("It is not a valid JSON %s value", expectedType.getName()));
        }
        break;
      case INTEGER_SPACE:
        if (!value.isTextual()) {
          throw new BatfishException(
              String.format("A Batfish %s must be a JSON string", expectedType.getName()));
        }
        IntegerSpace.parse(value.asText());
        break;
      case INTERFACE:
        if (!value.isTextual()) {
          throw new BatfishException(
              String.format("A Batfish %s must be a JSON string", expectedType.getName()));
        }
        break;
      case INTERFACE_GROUP_NAME:
        if (!value.isTextual() || value.asText().split(",").length != 2) {
          throw new BatfishException(
              String.format(
                  "A Batfish %s must be a JSON string with two comma-separated values",
                  expectedType.getName()));
        }
        break;
      case INTERFACE_NAME:
        if (!value.isTextual()) {
          throw new BatfishException(
              String.format("A Batfish %s must be a JSON string", expectedType.getName()));
        }
        break;
      case INTERFACE_PROPERTY_SPEC:
        if (!(value.isTextual())) {
          throw new BatfishException(
              String.format("A Batfish %s must be a JSON string", expectedType.getName()));
        }
        InterfacePropertySpecifier.create(value.textValue());
        break;
      case INTERFACE_TYPE:
        if (!(value.isTextual())) {
          throw new BatfishException(
              String.format("A Batfish %s must be a JSON string", expectedType.getName()));
        }
        Enum.valueOf(InterfaceType.class, value.textValue().toUpperCase());
        break;
      case INTERFACES_SPEC:
        if (!(value.isTextual())) {
          throw new BatfishException(
              String.format("A Batfish %s must be a JSON string", expectedType.getName()));
        }
        SpecifierFactories.getInterfaceSpecifierOrDefault(
            value.textValue(), AllInterfacesInterfaceSpecifier.INSTANCE);
        break;
      case IP:
        // TODO: Need to double check isInetAddress()
        if (!(value.isTextual())) {
          throw new BatfishException(
              String.format("A Batfish %s must be a JSON string", expectedType.getName()));
        }
        Ip.parse(value.textValue());
        break;
      case IP_PROTOCOL:
        if (!value.isTextual()) {
          throw new BatfishException(
              String.format("A Batfish %s must be a JSON string", expectedType.getName()));
        }
        try {
          IpProtocol.fromString(value.textValue());
        } catch (IllegalArgumentException e) {
          throw new BatfishException(String.format("Unknown %s string", expectedType.getName()));
        }
        break;
      case IP_SPACE_SPEC:
        if (!(value.isTextual())) {
          throw new BatfishException(
              String.format(
                  "A Batfish %s must be a JSON string with IpSpaceSpec grammar",
                  expectedType.getName()));
        }
        ParboiledIpSpaceSpecifier.parse(value.asText());
        break;
      case IP_WILDCARD:
        if (!value.isTextual()) {
          throw new BatfishException(
              String.format("A Batfish %s must be a JSON string", expectedType.getName()));
        }
        IpWildcard.parse(value.textValue());
        break;
      case IPSEC_SESSION_STATUS_SPEC:
        if (!value.isTextual()) {
          throw new BatfishException(
              String.format("A Batfish %s must be a JSON string", expectedType.getName()));
        }
        break;
      case JAVA_REGEX:
        if (!value.isTextual()) {
          throw new BatfishException(
              String.format("A Batfish %s must be a JSON string", expectedType.getName()));
        }
        try {
          Pattern.compile(value.textValue());
        } catch (PatternSyntaxException e) {
          throw new BatfishException("It is not a valid Java regular " + "expression", e);
        }
        break;
      case JSON_PATH_REGEX:
        if (!value.isTextual()) {
          throw new BatfishException(
              String.format("A Batfish %s must be a JSON string", expectedType.getName()));
        }
        validateJsonPathRegex(value.textValue());
        break;
      case LOCATION_SPEC:
        if (!value.isTextual()) {
          throw new BatfishException(
              String.format("A Batfish %s must be a JSON string", expectedType.getName()));
        }
        break;
      case LONG:
        if (!value.isLong()) {
          throw new BatfishException(
              String.format("It is not a valid JSON %s value", expectedType.getName()));
        }
        break;
      case MLAG_ID:
        if (!(value.isTextual())) {
          throw new BatfishException(
              String.format("A Batfish %s must be a JSON string", expectedType.getName()));
        }
        break;
      case MLAG_ID_SPEC:
        if (!(value.isTextual())) {
          throw new BatfishException(
              String.format("A Batfish %s must be a JSON string", expectedType.getName()));
        }
        break;
      case NAMED_STRUCTURE_SPEC:
        if (!(value.isTextual())) {
          throw new BatfishException(
              String.format("A Batfish %s must be a JSON string", expectedType.getName()));
        }
        NamedStructurePropertySpecifier.create(value.textValue());
        break;
      case NODE_PROPERTY_SPEC:
        if (!(value.isTextual())) {
          throw new BatfishException(
              String.format("A Batfish %s must be a JSON string", expectedType.getName()));
        }
        NodePropertySpecifier.create(value.textValue());
        break;
      case NODE_ROLE_DIMENSION:
        if (!value.isTextual()) {
          throw new BatfishException(
              String.format("A Batfish %s must be a JSON string", expectedType.getName()));
        }
        break;
      case NODE_ROLE_DIMENSION_NAME:
        if (!value.isTextual()) {
          throw new BatfishException(
              String.format("A Batfish %s must be a JSON string", expectedType.getName()));
        }
        break;
      case NODE_ROLE_NAME:
        if (!value.isTextual()) {
          throw new BatfishException(
              String.format("A Batfish %s must be a JSON string", expectedType.getName()));
        }
        break;
      case NODE_SPEC:
        if (!(value.isTextual())) {
          throw new BatfishException(
              String.format("A Batfish %s must be a JSON string", expectedType.getName()));
        }
        SpecifierFactories.getNodeSpecifierOrDefault(
            value.textValue(), AllNodesNodeSpecifier.INSTANCE);
        break;
      case OSPF_INTERFACE_PROPERTY_SPEC:
        if (!(value.isTextual())) {
          throw new BatfishException(
              String.format("A Batfish %s must be a JSON string", expectedType.getName()));
        }
        OspfInterfacePropertySpecifier.create(value.textValue());
        break;
      case OSPF_PROCESS_PROPERTY_SPEC:
        if (!(value.isTextual())) {
          throw new BatfishException(
              String.format("A Batfish %s must be a JSON string", expectedType.getName()));
        }
        OspfProcessPropertySpecifier.create(value.textValue());
        break;
      case OSPF_SESSION_STATUS_SPEC:
        if (!value.isTextual()) {
          throw new BatfishException(
              String.format("A Batfish %s must be a JSON string", expectedType.getName()));
        }
        break;
      case PATH_CONSTRAINT:
        if (!(value.isObject()) && !value.isNull()) {
          throw new BatfishException(
              String.format("A Batfish %s must be a JSON object or null", expectedType.getName()));
        }
        break;
      case PREFIX:
        if (!value.isTextual()) {
          throw new BatfishException(
              String.format("A Batfish %s must be a JSON string", expectedType.getName()));
        }
        Prefix.parse(value.textValue());
        break;
      case PREFIX_RANGE:
        if (!value.isTextual()) {
          throw new BatfishException(
              String.format("A Batfish %s must be a JSON string", expectedType.getName()));
        }
        PrefixRange.fromString(value.textValue());
        break;
      case PROTOCOL:
        if (!value.isTextual()) {
          throw new BatfishException(
              String.format("A Batfish %s must be a JSON string", expectedType.getName()));
        }
        Protocol.fromString(value.textValue());
        break;
      case QUESTION:
        // TODO: Implement
        break;
      case REFERENCE_BOOK_NAME:
        if (!value.isTextual()) {
          throw new BatfishException(
              String.format("A Batfish %s must be a JSON string", expectedType.getName()));
        }
        break;
      case ROUTING_POLICY_SPEC:
        if (!value.isTextual()) {
          throw new BatfishException(
              String.format("A Batfish %s must be a JSON string", expectedType.getName()));
        }
        SpecifierFactories.getRoutingPolicySpecifierOrDefault(
            value.textValue(), ALL_ROUTING_POLICIES);
        break;
      case ROUTING_PROTOCOL_SPEC:
        if (!value.isTextual()) {
          throw new BatfishException(
              String.format("A Batfish %s must be a JSON string", expectedType.getName()));
        }
        new RoutingProtocolSpecifier(value.textValue());
        break;
      case STRING:
        if (!value.isTextual()) {
          throw new BatfishException(
              String.format("A Batfish %s must be a JSON string", expectedType.getName()));
        }
        break;
      case STRUCTURE_NAME:
        if (!value.isTextual()) {
          throw new BatfishException(
              String.format("A Batfish %s must be a JSON string", expectedType.getName()));
        }
        break;
      case SUBRANGE:
        if (!(value.isTextual() || value.isInt())) {
          throw new BatfishException(
              String.format(
                  "A Batfish %s must be a JSON string or " + "integer", expectedType.getName()));
        }
        Object actualValue = value.isTextual() ? value.textValue() : value.asInt();
        new SubRange(actualValue);
        break;
      case VRF:
        if (!value.isTextual()) {
          throw new BatfishException(
              String.format("A Batfish %s must be a JSON string", expectedType.getName()));
        }
        break;
      case VXLAN_VNI_PROPERTY_SPEC:
        if (!(value.isTextual())) {
          throw new BatfishException(
              String.format("A Batfish %s must be a JSON string", expectedType.getName()));
        }
        VxlanVniPropertySpecifier.create(value.textValue());
        break;
      case ZONE:
        if (!value.isTextual()) {
          throw new BatfishException(
              String.format("A Batfish %s must be a JSON string", expectedType.getName()));
        }
        break;
      case JSON_PATH:
        validateJsonPath(value);
        break;
      default:
        throw new BatfishException(String.format("Unsupported parameter type: %s", expectedType));
    }
  }
