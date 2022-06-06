@JsonIgnore public static String toJson(UserEntity user) {

    if (user == null) {
      return null;
    }

    ObjectMapper mapper = new ObjectMapper();
    String json = "";

    try {
      json = mapper.writeValueAsString(user);
    } catch (JsonProcessingException e) {
      e.printStackTrace();
    }

    return json;
  }
