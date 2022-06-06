public static Integer stripLbIdFromZxtmName(String zxtmName) throws NumberFormatException, ArrayIndexOutOfBoundsException {
        return Integer.valueOf(zxtmName.split("_")[1]);
    }
