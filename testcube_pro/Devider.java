public class Devider {
    public double devideHandler(int x, int y) {
        if (y == 0)
            return 0;
        else
            return devide(x, y);
    }

    public double devide(int x, int y) {
        // exception not handled
        return x / y;
    }
}
