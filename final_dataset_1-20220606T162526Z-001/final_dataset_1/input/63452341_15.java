CharacterIndices getCharacterIndices(char start, char end, TickerView.ScrollingDirection direction) {
        int startIndex = getIndexOfChar(start);
        int endIndex = getIndexOfChar(end);

        if (startIndex < 0 || endIndex < 0) {
            return null;
        }

        switch (direction) {
            case DOWN:
                if (end == TickerUtils.EMPTY_CHAR) {
                    endIndex = characterList.length;
                } else if (endIndex < startIndex) {
                    endIndex += numOriginalCharacters;
                }

                break;
            case UP:
                if (startIndex < endIndex) {
                    startIndex += numOriginalCharacters;
                }

                break;
            case ANY:
                // see if the wrap-around animation is shorter distance than the original animation
                if (start != TickerUtils.EMPTY_CHAR && end != TickerUtils.EMPTY_CHAR) {
                    if (endIndex < startIndex) {
                        // If we are potentially going backwards
                        final int nonWrapDistance = startIndex - endIndex;
                        final int wrapDistance = numOriginalCharacters - startIndex + endIndex;
                        if (wrapDistance < nonWrapDistance) {
                            endIndex += numOriginalCharacters;
                        }
                    } else if (startIndex < endIndex) {
                        // If we are potentially going forwards
                        final int nonWrapDistance = endIndex - startIndex;
                        final int wrapDistance = numOriginalCharacters - endIndex + startIndex;
                        if (wrapDistance < nonWrapDistance) {
                            startIndex += numOriginalCharacters;
                        }
                    }
                }

                break;
        }

        return new CharacterIndices(startIndex, endIndex);
    }
