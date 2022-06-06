@Override
    public String toString() {
        final StringBuilder buffer = new StringBuilder();
        if (!initialPrompts.isEmpty()) {
            buffer.append("ip=");
            for (int index = 0; index < initialPrompts.size(); index++) {
                buffer.append(initialPrompts.get(index));
                if (index < initialPrompts.size() - 1) {
                    //https://github.com/RestComm/Restcomm-Connect/issues/1988
                    buffer.append(",");
                }
            }
        }

        if (buffer.length() > 0)
            buffer.append(SPACE_CHARACTER);
        buffer.append("dr=").append(driver);

        if (buffer.length() > 0)
            buffer.append(SPACE_CHARACTER);
        buffer.append("ln=").append(lang);

        if (endInputKey != null) {
            if (buffer.length() > 0)
                buffer.append(SPACE_CHARACTER);
            buffer.append("eik=").append(endInputKey);
        }
        if (maximumRecTimer > 0) {
            if (buffer.length() > 0)
                buffer.append(SPACE_CHARACTER);
            buffer.append("mrt=").append(maximumRecTimer * 10);
        }
        if (waitingInputTimer > 0) {
            if (buffer.length() > 0)
                buffer.append(SPACE_CHARACTER);
            buffer.append("wit=").append(waitingInputTimer * 10);
        }
        if (timeAfterSpeech > 0) {
            if (buffer.length() > 0)
                buffer.append(SPACE_CHARACTER);
            buffer.append("pst=").append(timeAfterSpeech * 10);
        }
        if (hotWords != null) {
            if (buffer.length() > 0)
                buffer.append(SPACE_CHARACTER);
            buffer.append("hw=").append(Hex.encodeHexString(hotWords.getBytes()));
        }
        if (input != null) {
            if (buffer.length() > 0)
                buffer.append(SPACE_CHARACTER);
            buffer.append("in=").append(input);
        }
        if (minNumber > 0) {
            if (buffer.length() > 0)
                buffer.append(SPACE_CHARACTER);
            buffer.append("mn=").append(minNumber);
        }
        if (maxNumber > 0) {
            if (buffer.length() > 0)
                buffer.append(SPACE_CHARACTER);
            buffer.append("mx=").append(maxNumber);
        }
        if (partialResult) {
            if (buffer.length() > 0)
                buffer.append(SPACE_CHARACTER);
            buffer.append("pr=").append(partialResult);
        }
        return buffer.toString();
    }
