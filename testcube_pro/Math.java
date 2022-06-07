public class Math {
    /*
     * Expected Behavior:
     * Given upperBound >= 0, the method returns
     * 1 + 2 + ... + upperBound
     * But This method is buggy, e.g. for upperBound == 4,
     * the method returns 1 + 2 + 3 instead of
     * 1 + 2 + 3 + 4
     */
    public static int sum(int upperBound) {
        int s = 0;
        for (int i = 0; i < upperBound; i++) {
            // i should have been <= upperBound
            s += i;
        }
        return s;
    }
}