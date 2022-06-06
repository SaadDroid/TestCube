@Override
	public void propertyChanged() {
		DataSetObservable oldDataSet = getDataSet();
		updateDataSet();
		DataSetObservable newDataSet = getDataSet();
		
		if(oldDataSet != newDataSet) {
			if (oldDataSet != null) {
				oldDataSet.removeListener(dispatcherListener);
			}
			if(newDataSet != null) {
				newDataSet.addListener(dispatcherListener);
			}
		}
	}
