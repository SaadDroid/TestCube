public Expression contains(String substring) {
        return ExpressionFactory.containsExp(path(), substring);
    }
