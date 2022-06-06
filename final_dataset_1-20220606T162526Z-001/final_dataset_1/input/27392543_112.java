public static String getPropertyNameForBranch(String key, int numBranches, int branchId) {
    Preconditions.checkArgument(numBranches >= 0, "The number of branches is expected to be non-negative");
    Preconditions.checkArgument(branchId >= 0, "The branchId is expected to be non-negative");
    return numBranches > 1 ? key + "." + branchId : key;
  }
