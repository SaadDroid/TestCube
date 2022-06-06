public boolean matches(Tree<T> tree) {
        boolean found = false;
        matchesList = new ArrayList<>();

        for (Tree<T> node : TreeTraversal.breadthFirstTraversal(tree)) {
            if (verbose) {
                logger.info("Comparing  node: ");
                logger.info(node.toString());
            }

            nodeTreeMatches = new ArrayList<>();
            nodeTreeMatches = doesNodeMatchPattern(node, getPattern(), nodeTreeMatches);
            if (nodeTreeMatches.size() > 0) {

                if (verbose) {
                    logger.info("Found...");
                }

                matchesList.addAll(nodeTreeMatches);
                found = true;
            }
        }

        return found;
    }
