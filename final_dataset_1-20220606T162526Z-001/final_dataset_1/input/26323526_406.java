public Collection<G>  getGraphHeadsByVariables(String... variables) {
    Collection<G>  result =
      Sets.newHashSetWithExpectedSize(variables.length);
    for (String variable : variables) {
      G graphHead = getGraphHeadByVariable(variable);
      if (graphHead != null) {
        result.add(graphHead);
      }
    }
    return result;
  }
