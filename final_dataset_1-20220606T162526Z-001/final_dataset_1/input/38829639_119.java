public static <T>  boolean equals(T left, T right) {
    ObjectMapper jsonMapper = Serialization.jsonMapper();
    if (left == null && right == null) {
      return true;
    } else if (left == null) {
      return false;
    } else if (right == null) {
      return false;
    }
    Map<String, Object> leftJson = jsonMapper.convertValue(left, TYPE_REF);
    Map<String, Object> rightJson = jsonMapper.convertValue(right, TYPE_REF);

    if (left instanceof KubernetesList) {
      return compareKubernetesList(leftJson, rightJson);
    } else {
      return compareKubernetesResource(leftJson, rightJson);
    }
  }
