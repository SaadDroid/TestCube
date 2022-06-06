static List<Integer> expandComponent(String component) {
    List<Integer> retList = new LinkedList<>();
    if (SOLO_PATTERN.matcher(component).matches()) {
      retList.add(Integer.parseInt(component));
    } else if (RANGE_PATTERN.matcher(component).matches()) {
      String strippedComponent = component.replaceAll("\\[|]", "");
      String[] range = strippedComponent.split("-");
      int lo = Integer.parseInt(range[0]);
      int hi = Integer.parseInt(range[1]);
      for (int i = lo; i <= hi; i++) {
        retList.add(i);
      }
    } else if (LIST_PATTERN.matcher(component).matches()) {
      String strippedComponent = component.replaceAll("\\[|]", "");
      String[] list = strippedComponent.split(",");
      Arrays.stream(list).forEach(i -> retList.add(Integer.parseInt(i)));
    } else {
      throw new IllegalArgumentException("Unknown pattern for component " + component);
    }
    return retList;
  }
