private void addMissingPrefix(TLiteralExpression exp, Set<String> names) {
        if (exp != null) {
            String newText = addMissingPrefix(exp.getText(), names);
            exp.setText(newText);
        }
    }
