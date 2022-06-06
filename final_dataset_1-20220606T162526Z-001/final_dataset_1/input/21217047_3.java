@Override
    public boolean test(OpenNode<? extends String, ?> node) {
        final Matcher matcher = pattern.matcher(node.getElement());
        return matcher.matches();
    }
