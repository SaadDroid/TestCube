public class StringOps {
    private String str;

    public String getstr() {
        return str;
    }

    public void setStr(String s) {
        this.str = s;
    }

    public String concat(String x) {
        return this.str + x;
    }

    public char getCharFromIdx(int x) {
        char c = this.str.charAt(x);
        return c;
    }
}