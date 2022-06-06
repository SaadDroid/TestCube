@Override
    public void write(String str) {
        if (" />".equals(str)) {
            out.write("/>");
        } else {
            out.write(str);
        }
    }
