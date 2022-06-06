public String getOutput() {
        String output = getStrippedOutput();
        for (WikidataLink link : links) {
            if (link.getTitle() == null) {
                output = output.replace("LINK_" + link.getContentHash(), "[[" + link.getContent() + "]]");
            } else {
                output = output.replace(
                        "LINK_" + link.getContentHash(), "[[" + link.getContent() + "|" + link.getTitle() + "]]");
            }
        }
        for (MathTag tag : mathTags) {
            output = output.replace("FORMULA_" + tag.getContentHash(),
                    "<math>" + tag.getContent() + "</math>");
        }
        return output;
    }
