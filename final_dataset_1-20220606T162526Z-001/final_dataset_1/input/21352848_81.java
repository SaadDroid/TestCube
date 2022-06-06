public static String subsup(String markup) {
    return markup.replaceAll("[{<]sub[}>](.+?)[{<]/sub[}>]", "_$1")
        .replaceAll("[{<]sup[}>](.+?)[{<]/sup[}>]", "^$1");
  }
