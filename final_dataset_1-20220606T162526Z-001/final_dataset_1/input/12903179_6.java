@SuppressWarnings("unchecked")
    public static <ViewType extends View<? extends ViewModelType>, ViewModelType extends ViewModel> ViewModelType createViewModel(
            ViewType view) {
        final Class<?> viewModelType = TypeResolver.resolveRawArgument(View.class, view.getClass());
        if (viewModelType == ViewModel.class) {
            return null;
        }
        if (TypeResolver.Unknown.class == viewModelType) {
            return null;
        }
        return (ViewModelType) DependencyInjector.getInstance().getInstanceOf(viewModelType);
    }
