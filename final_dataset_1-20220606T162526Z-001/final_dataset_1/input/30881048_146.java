public Dimension2D getPreferredSize(Container container) {
		// Fetch components
		Map<Location, Drawable> comps = getComponentsByLocation(container);
		Drawable north = comps.get(Location.NORTH);
		Drawable northEast = comps.get(Location.NORTH_EAST);
		Drawable east = comps.get(Location.EAST);
		Drawable southEast = comps.get(Location.SOUTH_EAST);
		Drawable south = comps.get(Location.SOUTH);
		Drawable southWest = comps.get(Location.SOUTH_WEST);
		Drawable west = comps.get(Location.WEST);
		Drawable northWest = comps.get(Location.NORTH_WEST);
		Drawable center = comps.get(Location.CENTER);

		// Calculate maximum widths and heights
		double widthWest    = getMaxWidth(northWest,  west,   southWest);
		double widthCenter  = getMaxWidth(north,      center, south);
		double widthEast    = getMaxWidth(northEast,  east,   southEast);
		double heightNorth  = getMaxHeight(northWest, north,  northEast);
		double heightCenter = getMaxHeight(west,      center, east);
		double heightSouth  = getMaxHeight(southWest, south,  southEast);

		double gapEast  = (widthEast > 0.0 && center != null) ? getGapX() : 0.0;
		double gapWest  = (widthWest > 0.0 && center != null) ? getGapX() : 0.0;
		double gapNorth = (heightNorth > 0.0 && center != null) ? getGapY() : 0.0;
		double gapSouth = (heightSouth > 0.0 && center != null) ? getGapY() : 0.0;

		// Calculate preferred dimensions
		Insets2D insets = container.getInsets();
		if (insets == null) {
			insets = new Insets2D.Double();
		}
		double width = insets.getLeft() + widthEast + gapEast + widthCenter +
			gapWest + widthWest + insets.getRight();
		double height = insets.getTop() + heightNorth + gapNorth + heightCenter +
			gapSouth + heightSouth + insets.getBottom();

		return new de.erichseifert.gral.graphics.Dimension2D.Double(
			width, height
		);
	}
