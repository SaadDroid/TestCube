static Comment parse(String owningClass, String commentText) {
        return isBlank(commentText) ? Comment.createEmpty() : new Comment(parseElements(owningClass, commentText.trim()));
    }
