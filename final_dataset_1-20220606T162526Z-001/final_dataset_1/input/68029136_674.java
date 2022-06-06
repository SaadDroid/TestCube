public PredecessorResult handlePredecessor(String successorName, String predecessorName, ForeignableOwner actingOwner) {
        final ResourceEntity successorResource = getSuccessor(successorName);
        return doHandlePredecessor(successorResource, predecessorName, actingOwner);
    }
