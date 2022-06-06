@Nullable
    public static String wrapWords(String line, String newLine, int watermark, boolean wrapLongWords) {
        if (line == null) {
            return null;
        } else {
            if (newLine == null) {
                newLine = System.lineSeparator();
            }

            if (watermark < 1) {
                watermark = 1;
            }

            int inputLineLength = line.length();
            int offset = 0;
            StringBuilder sb = new StringBuilder(inputLineLength + 32);

            while (inputLineLength - offset > watermark) {
                if (line.charAt(offset) == 32) {
                    ++offset;
                } else {
                    int spaceToWrapAt = line.lastIndexOf(32, watermark + offset);
                    if (spaceToWrapAt >= offset) {
                        sb.append(line.substring(offset, spaceToWrapAt));
                        sb.append(newLine);
                        offset = spaceToWrapAt + 1;
                    } else if (wrapLongWords) {
                        sb.append(line.substring(offset, watermark + offset));
                        sb.append(newLine);
                        offset += watermark;
                    } else {
                        spaceToWrapAt = line.indexOf(32, watermark + offset);
                        if (spaceToWrapAt >= 0) {
                            sb.append(line.substring(offset, spaceToWrapAt));
                            sb.append(newLine);
                            offset = spaceToWrapAt + 1;
                        } else {
                            sb.append(line.substring(offset));
                            offset = inputLineLength;
                        }
                    }
                }
            }

            sb.append(line.substring(offset));
            return sb.toString();
        }
    }
