public FloatMatrix submatrix(int i, int j, int k, int l) {
        if (i < 0 || i >= m || k < i || k >= m || j < 0 || j >= n || l < j || l >= n) {
            throw new IllegalArgumentException(String.format("Invalid submatrix range (%d:%d, %d:%d) of %d x %d", i, k, j, l, m, n));
        }

        int offset = index(i, j);
        int length = index(k, l) - offset + 1;
        FloatBuffer B = FloatBuffer.wrap(A.array(), offset, length);

        return of(layout(),k - i + 1, l - j + 1, ld, B);
    }
