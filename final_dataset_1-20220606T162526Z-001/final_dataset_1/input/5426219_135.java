public static JsonObject serialize(CardModel cardModel) {
        JsonObject result = new JsonObject();
        result.addProperty("iconType", cardModel.iconType().name().toLowerCase());
        result.addProperty("iconSrc", cardModel.iconSrc());

        if (cardModel.description().getLeft().isPresent() || cardModel.description().getRight().isPresent()) {
            result.add("description", getTextAndUrl(cardModel.description()));
        }

        if (cardModel.content().size() != 0) {
            result.add("content", getContent(cardModel.content()));
        }

        return result;
    }
