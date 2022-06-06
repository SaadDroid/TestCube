@Override
  protected ImageView initComponentHostView(@NonNull Context context) {
    WXImageView view = new WXImageView(context);
    view.setScaleType(ScaleType.FIT_XY);
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
      view.setCropToPadding(true);
    }
    view.holdComponent(this);
    return view;
  }
