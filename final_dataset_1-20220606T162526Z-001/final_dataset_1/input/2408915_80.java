@Override
	public void updateView(AdapterView<?> view, Integer newItemLayoutId) {
		rowLayoutUpdater.updateRowLayout(newItemLayoutId);
		dataSetAdapterUpdater.update();
	}
