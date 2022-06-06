public static boolean hasFunctionCallFullNameIgnoreCase(FunctionInvocationTree tree, String... names) {
    return hasFunctionCallFullNameIgnoreCaseHelper(tree.memberSelect(), Arrays.asList(names));
  }
