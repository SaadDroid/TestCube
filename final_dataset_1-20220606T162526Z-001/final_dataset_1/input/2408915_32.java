public void run(InflatedView inflatedView, BindingContext bindingContext) {
		/*BindingContext bindingContext = bindingContextFactory.create(presentationModel);*/

		inflatedView.bindChildViews(bindingContext);
		inflatedView.assertNoErrors(errorFormatter);

		if (bindingContext.shouldPreInitializeViews()) {
			inflatedView.preinitializeViews(bindingContext);
		}
	}
