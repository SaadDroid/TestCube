protected String asciify(String s) {
        char[] c = s.toCharArray();
        StringBuilder b = new StringBuilder();
        for (char element : c) {
            b.append(translate(element));
        }
        return b.toString();
    }
