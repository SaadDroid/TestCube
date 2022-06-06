public int statements(Tree tree) {
    statements = 0;
    scan(new TreeContext(), tree);
    return statements;
  }
