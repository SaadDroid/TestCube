public class Harmony {
    public int pow(int p, int n) {
        if (n == 0)
            return 1;
        return p * pow(p, n - 1);
    }
}