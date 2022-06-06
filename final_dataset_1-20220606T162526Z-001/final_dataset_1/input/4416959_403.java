public static <T> boolean isEqual(T left, T right)
    {
        if (left == right)
            return true;

        if (left == null)
            return false;

        return left.equals(right);
    }
