protected ParseGraph closeBranch() {
        if (!branched) {
            throw new IllegalStateException("Cannot close branch that is not open.");
        }
        if (head.asGraph().branched) {
            return new ParseGraph(head.asGraph().closeBranch(), tail, definition, true);
        }
        return new ParseGraph(head, tail, definition, false);
    }
