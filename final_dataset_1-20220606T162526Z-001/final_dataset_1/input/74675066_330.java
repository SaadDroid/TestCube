@Override
    public Optional<JWKSet> convert(ObjectNode node) {
        if (node == null) {
            return null;
        }

        if (node.get("keys") == null ||
                node.get("keys").isNull() ||
                node.get("keys").equals(new TextNode("null")) ||
                node.get("keys").equals(new TextNode(""))
        ) {
            return Optional.empty();
        }

        return convert(node.toString());
    }
