public void draw(DrawingContext context) {
		boolean wordWrap = isWordWrapEnabled();
		Shape labelShape = getCachedOutline(wordWrap);

		if (labelShape == null) {
			return;
		}

		Rectangle2D textBounds = labelShape.getBounds2D();

		// Rotate label text around its center point
		double rotation = getRotation();
		if (MathUtils.isCalculatable(rotation) && rotation != 0.0) {
			AffineTransform txLabelText =
				AffineTransform.getRotateInstance(
					Math.toRadians(-rotation),
					textBounds.getCenterX(),
					textBounds.getCenterY()
				);
			labelShape = txLabelText.createTransformedShape(labelShape);
			textBounds = labelShape.getBounds2D();
		}

		// Get graphics instance and store state information
		Graphics2D graphics = context.getGraphics();
		AffineTransform txOld = graphics.getTransform();

		// Draw background
		Paint background = getBackground();
		if (background != null) {
			GraphicsUtils.fillPaintedShape(graphics, getBounds(), background, null);
		}

		// Calculate absolute text position:
		// First, move the text to the upper left of the bounding rectangle
		double shapePosX = getX() - textBounds.getX();
		double shapePosY = getY() - textBounds.getY();
		// Position the text inside the bounding rectangle using the alignment
		// settings
		double alignmentX = getAlignmentX();
		double alignmentY = getAlignmentY();
		shapePosX += alignmentX*(getWidth() - textBounds.getWidth());
		shapePosY += alignmentY*(getHeight() - textBounds.getHeight());
		// Apply positioning
		graphics.translate(shapePosX, shapePosY);

		// Paint the shape with the color from settings
		Paint paint = getColor();
		GraphicsUtils.fillPaintedShape(graphics, labelShape, paint, null);


		// Restore previous state
		graphics.setTransform(txOld);
	}
