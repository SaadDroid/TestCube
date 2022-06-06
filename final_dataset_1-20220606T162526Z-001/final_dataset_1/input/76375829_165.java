public void display(char c, int index, boolean dot) throws IOException {
        int val = Font.DATA[c];
        if (dot) {
            val |= Font.DATA['.'];
        }
        writeColumn(index, (short) val);
    }
