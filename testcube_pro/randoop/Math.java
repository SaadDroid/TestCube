
public class Math {
    /*Expected Behavior:
          Given upperBound >= 0, the method returns
               1 + 2 + ... + upperBound                 
      But This method is buggy and works only on
      inputs with odd value, e.g. for upperBound == 4,
      the method returns 1 + 2 + 3 + 4 + 1 instead of
      1 + 2 + 3 + 4                                   */
    public static int sum(int upperBound) {
        int s = 0;
        for (int i = 0; i <= upperBound; i++) {
            s += i;
        }
        if (upperBound % 2 == 0) {// <--------- BUG!
            s++;                  // <--------- BUG!
        }                         // <--------- BUG!
        return s;
    }
}