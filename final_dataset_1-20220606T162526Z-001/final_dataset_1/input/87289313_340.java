@Override
    public String apply(final Object input1, final Object input2) {
        if (null == input1) {
            if (null == input2) {
                return null;
            }
            return String.valueOf(input2);
        }

        if (null == input2) {
            return String.valueOf(input1);
        }

        return input1 + separator + input2;
    }
