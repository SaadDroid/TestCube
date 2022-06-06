public static List<Integer> replaceStringCodePoints(String stringToReplace, Random random) {
        List<Integer> codePoints = new ArrayList<>();
        long numberCodePoints = stringToReplace.codePoints().count();
        for (int i = 0; i < numberCodePoints; i++) {
            Integer codePoint = stringToReplace.codePointAt(i);
            codePoints.add(replaceCharacter(codePoint, random));
        }
        return codePoints;
    }
