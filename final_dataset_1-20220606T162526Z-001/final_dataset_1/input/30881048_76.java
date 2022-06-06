public Double next() {
		long i, digit;
		double h, step;

		if (++c == Long.MAX_VALUE) {
			c = 0;
		}

		i = c;
		h = 0.0;
		step = 1.0 / base;

		while (i > 0) {
			digit = i % base;
		    h += digit * step;
		    i = (i - digit) / base;
		    step /= base;
		}

		return h;
	}
