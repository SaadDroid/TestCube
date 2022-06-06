public static int compare(Object o1, Object o2) throws UnknownValueTypeException {
        if (!isValidNumber(o1) || !isValidNumber(o2)) {
            throw new UnknownValueTypeException();
        }

        return compareUnsafe(o1, o2);
    }
