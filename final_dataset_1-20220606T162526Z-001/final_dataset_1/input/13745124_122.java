@Override
  public String toString(@NullableDecl String root, Iterable<String> names) {
    StringBuilder builder = new StringBuilder();
    if (root != null) {
      builder.append(root);
    }
    joiner().appendTo(builder, names);
    return builder.toString();
  }
