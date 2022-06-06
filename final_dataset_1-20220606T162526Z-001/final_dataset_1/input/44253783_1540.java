public String[] render() {
    List<String> result = new ArrayList<>();
    for (Map.Entry<String, String> entry : dashArgs.entrySet()) {
      result.add(entry.getKey());
      result.add(entry.getValue());
    }
    for (String s : normalArgs) {
      result.add(s);
    }
    return result.toArray(new String[0]);
  }
