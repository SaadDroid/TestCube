public String generateOneParagraphHtml(int quantity, boolean startWithLorem) {

        return generateMarkupSentences("<p>" + LINE_SEPARATOR + "\t", LINE_SEPARATOR + "</p>", LINE_SEPARATOR,
                quantity, startWithLorem);

    }
