public static String dumpType(RelDataType type) {
    final StringWriter sw = new StringWriter();
    final PrintWriter pw = new PrintWriter(sw);
    final TypeDumper typeDumper = new TypeDumper(pw);
    if (type.isStruct()) {
      typeDumper.acceptFields(type.getFieldList());
    } else {
      typeDumper.accept(type);
    }
    pw.flush();
    return sw.toString();
  }
