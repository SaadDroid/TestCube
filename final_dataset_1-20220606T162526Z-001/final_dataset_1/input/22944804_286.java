public List<String> csvStringToList(final String csv, final boolean lowerCase) {

        if (csv == null) {
            return new ArrayList<String>();
        }

        final String[] split = csv.split(",");

        for(int i = 0; i < split.length; i++) {
            if (lowerCase) {
                split[i] = split[i].toLowerCase().trim();
            } else {
                split[i] = split[i].trim();
            }
        }

        return new ArrayList<String>(Arrays.asList(split));
    }
