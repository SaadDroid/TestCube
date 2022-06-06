@Override
  public T getNode(final int step, final int node) {
    if (step < 0) {
      throw new IllegalArgumentException("Step number cannot be negative");
    }
    if (node < 0) {
      throw new IllegalArgumentException("Node number cannot be negative");
    }
    if (step > _tree.length) {
      throw new IllegalArgumentException("Step number " + step + " is greater than maximum in this tree (max =  " + _tree.length + ")");
    }
    final int max = getMaxNodesForStep(step);
    if (node > max) {
      throw new IllegalArgumentException("Node number " + node + " is greater than the number of nodes at this step number (max = " + max + ")");
    }
    return _tree[step][node];
  }
