public String getFormattedDetailedUsage() throws TransformerException, IOException {
        String usage = null;
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream();
            InputStream is = getClass().getResourceAsStream("detailedUsage.xsl")) {
            toolspec.transform(is, baos);
            usage = baos.toString();
        }
        // we use the following pattern to format usage
        // |-------|-options|------|description-----------------|
        // before option white space size is 7
        int beforeOptSpan = 3;
        // option length is 8
        int optSize = 12;
        // after option white space size is 6
        int afterOptLen = 6;
        int totalLen = 80;
        int optSpan = optSize + afterOptLen - 1;
        int beforeDesSpan = beforeOptSpan + optSpan + 1;
        String lineSeparator = System.getProperty("line.separator");
        StringTokenizer st1 = new StringTokenizer(usage, lineSeparator);
        int i = 0;
        int length = st1.countTokens();
        String[] originalStrs = new String[length];
        while (st1.hasMoreTokens()) {
            String str = st1.nextToken();
            originalStrs[i] = str;
            i++;
        }
        StringBuilder strbuffer = new StringBuilder();
        for (int j = 0; j < length - 1; j = j + 2) {
            int optionLen = originalStrs[j].length();
            addWhiteNamespace(strbuffer, beforeOptSpan);
            if (optionLen <= optSpan) {
                // && beforeOptSpan + optionLen + optSpan + desLen <= totalLen -
                // 1) {

                strbuffer.append(originalStrs[j]);
                addWhiteNamespace(strbuffer, optSpan - originalStrs[j].length());
                strbuffer.append(' ');
                if (originalStrs[j + 1].length() > totalLen - beforeDesSpan) {
                    int lastIdx = totalLen - beforeDesSpan;
                    int lastIdx2 = splitAndAppendText(strbuffer, originalStrs[j + 1], 0, lastIdx);
                    originalStrs[j + 1] = originalStrs[j + 1].substring(lastIdx2);
                    strbuffer.append(lineSeparator);
                } else {
                    strbuffer.append(originalStrs[j + 1]);
                    strbuffer.append(lineSeparator);
                    originalStrs[j + 1] = "";
                }
            } else {
                strbuffer.append(originalStrs[j]);
                strbuffer.append(lineSeparator);
            }
            String tmpStr = originalStrs[j + 1];

            for (i = 0; i < tmpStr.length(); i = i + (totalLen - beforeDesSpan)) {
                if (i + totalLen - beforeDesSpan < tmpStr.length()) {
                    addWhiteNamespace(strbuffer, beforeDesSpan);
                    int lastIdx = i + totalLen - beforeDesSpan;
                    int lastIdx2 = splitAndAppendText(strbuffer, tmpStr, i, lastIdx);
                    i += lastIdx2 - lastIdx;
                    strbuffer.append(lineSeparator);
                } else {
                    addWhiteNamespace(strbuffer, beforeDesSpan);
                    strbuffer.append(tmpStr.substring(i));
                    strbuffer.append(lineSeparator);
                }
            }
            strbuffer.append(lineSeparator);

        }

        return strbuffer.toString();
    }
