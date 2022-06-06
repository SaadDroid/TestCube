public String[] readNext() throws IOException {

        String[] result = null;
        do {
            String nextLine = getNextLine();
            if (!hasNext) {
                return result; // should throw if still pending?
            }
            String[] r = parser.parseLineMulti(nextLine);
            if (r.length > 0) {
                if (result == null) {
                    result = r;
                } else {
                    String[] t = new String[result.length + r.length];
                    System.arraycopy(result, 0, t, 0, result.length);
                    System.arraycopy(r, 0, t, result.length, r.length);
                    result = t;
                }
            }
        } while (parser.isPending());
        return result;
    }
