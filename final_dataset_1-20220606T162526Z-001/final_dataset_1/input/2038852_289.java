protected static String nearString(String strIn, int lineNum, int colNum) {
        String out = "";
        StringBuilder sb = new StringBuilder();
        String line;
        String lineOut;
        List<String> lines;
        int i;
        int last_i;

        lines = lineSplit(strIn);
        last_i = lines.size() - 1;
        for (i = lineNum; i <= last_i; i++) {
            lineOut = lines.get(i);
            if (i == lineNum) {
                if (colNum > lineOut.length()) {
                    continue;
                }
                lineOut = lineOut.substring(colNum);
            }
            if (i != last_i) {
                lineOut = String.format("%s\n", lineOut);
            }
            sb.append(lineOut);
        }

        out = sb.toString();
        return out;
    }
