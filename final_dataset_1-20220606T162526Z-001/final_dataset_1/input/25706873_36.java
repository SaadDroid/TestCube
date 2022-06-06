public void set(int row, int col, E val) {
		if (row < 0 || row >= values.length || col < 0 || col >= values[0].length)
			throw new IndexOutOfBoundsException("Row or column index out of bounds");
		values[row][col] = val;
	}
