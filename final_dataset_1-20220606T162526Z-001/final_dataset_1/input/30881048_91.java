public Point2D getPoint2D(int dimX, int dimY) {
		if (getDimensions() < 2) {
			throw new ArrayIndexOutOfBoundsException(
					"Can't create two-dimensional point from " + //$NON-NLS-1$
					getDimensions() + "D data."); //$NON-NLS-1$
		}
		return new Point2D.Double(
				get(dimX).doubleValue(), get(dimY).doubleValue());
	}
