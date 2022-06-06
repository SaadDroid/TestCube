@Override
    public List<Sort> parse(String unparsedSort, String unparsedDir) {

        if (unparsedSort == null || unparsedSort.isEmpty()) {
            return Collections.emptyList();
        }

        List<Sort> orderings = new ArrayList<>(3);

        if (unparsedSort.startsWith("[")) {
            appendFromArray(orderings, jsonParser.parseJson(unparsedSort));
        } else if (unparsedSort.startsWith("{")) {
            appendFromObject(orderings, jsonParser.parseJson(unparsedSort));
        } else {
            // "dir" is only applicable to "simple" sorts.. ignoring it for arrays and objects
            appendPath(orderings, unparsedSort, unparsedDir);
        }

        return orderings;
    }
