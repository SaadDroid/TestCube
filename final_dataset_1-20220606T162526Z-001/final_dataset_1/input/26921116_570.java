public static Stream<AssociationRule> apply(double confidence, FPTree tree) {
        TotalSupportTree ttree = new TotalSupportTree(tree);
        ARM arm = new ARM(confidence, ttree);
        return StreamSupport.stream(arm.spliterator(), false);
    }
