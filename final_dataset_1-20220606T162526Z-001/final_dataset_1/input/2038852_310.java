public static String integerList2cdString(List<Integer> ints) throws ConverterException {
        StringBuilder sb = new StringBuilder();
        String component;
        int intListSize;
        int i;
        if (ints == null) {
            throw new ConverterException("Could not convert a null Integer list to String");
        }
        intListSize = ints.size();

        if (intListSize <= 0) {
            return sb.toString(); // if they pass in a list with no items then return an empty string
        }
        for (i = 0; i < intListSize - 1; i++) {
            component = String.format("%d,", ints.get(i));
            sb.append(component);
        }
        component = String.format("%d",ints.get(intListSize-1));
        sb.append(component);
        return sb.toString();
    }
