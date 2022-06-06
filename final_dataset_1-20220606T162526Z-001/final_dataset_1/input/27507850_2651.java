@VisibleForTesting
  static Object extractValue(Operand operand, Row row) {
    if (operand.getType() == Operand.Type.COLUMN) {
      @SuppressWarnings("unchecked")
      List<String> columns = (List<String>) operand.getValue();
      JsonNode object = BatfishObjectMapper.mapper().valueToTree(row.get(columns.get(0)));
      try {
        return extractValue(object, columns, 1);
      } catch (BatfishException | JsonProcessingException e) {
        throw new NoSuchElementException(
            String.format(
                "Could not extract value from '\"%s\":%s' using column specification '%s': %s",
                columns.get(0), object, columns, e.getMessage()));
      }
    }
    return operand.getValue();
  }
