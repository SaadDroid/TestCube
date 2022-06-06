SQLTemplateParser get() {
        SQLTemplateParser parser = parsers.poll();
        if(parser == null) {
            parser = createNewParser();
        }
        return parser;
    }
