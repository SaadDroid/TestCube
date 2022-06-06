@Override
	public void add(int index, DataSource source, boolean visible) {
		if (getData().size() > 0) {
			throw new IllegalArgumentException(
				"This plot type only supports a single data source."); //$NON-NLS-1$
		}
		// By the looks of it, some objects depend on a BoxWhiskerRenderer being present when super.add is called
		// However, super.add overwrites renderers, so we have to create the BoxWhiskerRenderer twice.
		BoxWhiskerRenderer renderer = new BoxWhiskerRenderer();
		setPointRenderers(source, renderer);
		super.add(index, source, visible);
		// FIXME: Overwrites possible present point and line renderers
		setLineRenderers(source, null);
		setPointRenderers(source, renderer);
	}
