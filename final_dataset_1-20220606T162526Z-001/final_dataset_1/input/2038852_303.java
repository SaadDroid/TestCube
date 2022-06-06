public static List<Integer> cdString2IntegerList(String ints) throws ConverterException {
        List<Integer> out = new ArrayList<Integer>();
        String format;
        String msg;
        Integer currInt;
        int i;

        if (ints == null) {
            throw new ConverterException("ints was null can't convert");
        }

        String[] splitInts = ints.split(",");
        if (splitInts.length == 0) {
            msg = String.format("Error \"%s\" yeilded an empty ArrayList");
            throw new ConverterException(msg);
        }

        if (splitInts[0].trim().equals("")) {
            return out; // If they pass an empty String give them an empty List I guess
        }

        for (i = 0; i < splitInts.length; i++) {
            try {
                currInt = Integer.parseInt(splitInts[i].trim());
            } catch (NumberFormatException ex) {
                format = "Could not convert \"%s\" to Integer\n";
                msg = String.format(format, splitInts[i]);
                throw new ConverterException(msg);
            }
            out.add(currInt);
        }
        return out;
    }
