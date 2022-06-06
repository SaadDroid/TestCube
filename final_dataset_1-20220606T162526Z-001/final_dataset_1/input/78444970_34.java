@Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(getNumberOfBits());

        for (int i = 0; i < numBits; i++) {
            sb.append(bits.get(i) ? "1" : 0);
        }

        return sb.toString();
    }
