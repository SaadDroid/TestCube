public void layout(Container container) {
		Info[] infos = getInfo(container);

		Rectangle2D bounds = container.getBounds();
		Insets2D insets = container.getInsets();
		if (insets == null) {
			insets = new Insets2D.Double();
		}
		Integer lastCol = infos[COLS].size - 1;

		int compIndex = 0;
		double x = bounds.getX() + insets.getLeft();
		double y = bounds.getY() + insets.getTop();
		for (Drawable component : container) {
			Integer col = compIndex%infos[COLS].size;
			Integer row = compIndex/infos[COLS].size;

			double colWidth = infos[COLS].sizes.get(col);
			double rowHeight = infos[ROWS].sizes.get(row);

			double w = Math.max(infos[COLS].sizeMean - infos[COLS].unsizeableSpace, colWidth);
			double h = Math.max(infos[ROWS].sizeMean - infos[ROWS].unsizeableSpace, rowHeight);

			if (component != null) {
				component.setBounds(x, y, w, h);
			}

			if (col.equals(lastCol)) {
				x = bounds.getX() + insets.getLeft();
				y += h + getGapY();
			} else {
				x += w + getGapX();
			}

			compIndex++;
		}
	}
