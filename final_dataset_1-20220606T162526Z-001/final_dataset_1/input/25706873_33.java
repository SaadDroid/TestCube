public static int[] circularConvolve(int[] vec0, int[] vec1) {
		if (vec0.length == 0 || vec0.length != vec1.length)
			throw new IllegalArgumentException();
		int maxval = Integer.MIN_VALUE;
		for (int x : vec0) {
			if (x < 0)
				throw new IllegalArgumentException();
			maxval = Math.max(x, maxval);
		}
		for (int x : vec1) {
			if (x < 0)
				throw new IllegalArgumentException();
			maxval = Math.max(x, maxval);
		}
		
		BigInteger minmod = BigInteger.valueOf(maxval).pow(2)
			.multiply(BigInteger.valueOf(vec0.length)).add(BigInteger.ONE);
		if (minmod.bitLength() > 31)
			throw new ArithmeticException();
		int mod = findModulus(vec0.length, minmod.intValue());
		int root = findPrimitiveRoot(vec0.length, mod - 1, mod);
		int[] temp0 = transform(vec0, root, mod);
		int[] temp1 = transform(vec1, root, mod);
		int[] temp2 = new int[temp0.length];
		for (int i = 0; i < temp0.length; i++)
			temp2[i] = (int)((long)temp0[i] * temp1[i] % mod);
		return inverseTransform(temp2, root, mod);
	}
