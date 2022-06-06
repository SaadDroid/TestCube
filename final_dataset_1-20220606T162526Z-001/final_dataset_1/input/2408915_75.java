@Override
	public int getItemViewType(Object item, int position) {
		ViewTypeSelectionContext<Object> context = new ViewTypeSelectionContext<Object>(getViewTypeCount(), item, position);
		int selectedViewType = userSelectViewType(context);
		
		checkViewType(selectedViewType);
		
		return selectedViewType;
	}
