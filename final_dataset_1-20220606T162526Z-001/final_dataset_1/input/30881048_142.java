public Dimension2D getPreferredSize(Container container) {
		Insets2D insets = container.getInsets();

		double width = insets.getLeft();
		double height = insets.getTop();
		int count = 0;
		if (getOrientation() == Orientation.HORIZONTAL) {
			double h = 0.0;
			for (Drawable component : container) {
				if (count++ > 0) {
					width += getGapX();
				}
				Dimension2D itemBounds = component.getPreferredSize();
				width += itemBounds.getWidth();
				h = Math.max(height, itemBounds.getHeight());
			}
			height += h;
		} else if (getOrientation() == Orientation.VERTICAL) {
			double w = 0.0;
			for (Drawable component : container) {
				if (count++ > 0) {
					height += getGapY();
				}
				Dimension2D itemBounds = component.getPreferredSize();
				w = Math.max(w, itemBounds.getWidth());
				height += itemBounds.getHeight();
			}
			width += w;
		}
		width += insets.getRight();
		height += insets.getBottom();

		return new de.erichseifert.gral.graphics.Dimension2D.Double(width, height);
	}
