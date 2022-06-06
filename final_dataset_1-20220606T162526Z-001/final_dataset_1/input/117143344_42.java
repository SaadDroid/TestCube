public static Properties loadProperties(String name) {
    //System.out.println(getName(name));
    return getProperties(getClassLoader(), getName(name));
  }
