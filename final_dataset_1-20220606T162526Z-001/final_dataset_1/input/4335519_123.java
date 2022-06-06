public static ControlFlowGraph build(ScriptTree tree) {
    return new ControlFlowGraphBuilder().createGraph(tree);
  }
