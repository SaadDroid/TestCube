public boolean hasChanged() {
        boolean isDecrypted = propertyValue != null && propertyValue.equals(UNDECRYPTED);
        boolean isEqualToOriginalValue = (originalValue == null && propertyValue == null)
                || (originalValue != null && originalValue.equals(propertyValue));
        boolean isEqualPropertyComment = (originalPropertyComment == null && propertyComment == null)
                || (originalPropertyComment != null && originalPropertyComment.equals(propertyComment));

        if (isDecrypted || isReset()) {
            return false;
        }
        else {
            return !isEqualToOriginalValue || !isEqualPropertyComment;
        }
    }
