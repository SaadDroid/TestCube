@Override
	public void bindTo(BindingContext bindingContext) {
		try {
			performBind(bindingContext);
		} catch (RuntimeException e) {
			throw new AttributeBindingException(attribute.getName(), e);
		}
	}
