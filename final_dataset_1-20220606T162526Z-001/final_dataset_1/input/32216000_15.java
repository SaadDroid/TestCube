@Override
    public void write(String str) {
        char[] chars = str.toCharArray();
        for (char ch : chars) {
            writeOneCharacter(ch);
        }
    }
