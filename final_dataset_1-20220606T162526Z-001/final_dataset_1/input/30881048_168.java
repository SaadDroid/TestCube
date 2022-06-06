@Override
	public Paint get(double value) {
		Double v = scale(value);
		v = applyMode(v, 0.0, 1.0);
		if (!MathUtils.isCalculatable(v)) {
			return null;
		}

		float hue = v.floatValue();
		return Color.getHSBColor(hue, 1f, 1f);
	}
