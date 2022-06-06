@Override
    public void onReceive(Context context, Intent intent) {
        if (TextUtils.equals(intent.getAction(), ACTION_REFRESH_WIDGET)) {
            int appWidgetId = intent.getIntExtra(AppWidgetManager.EXTRA_APPWIDGET_ID,
                    AppWidgetManager.INVALID_APPWIDGET_ID);
            new WidgetHelper(context).refresh(appWidgetId);
        } else if (TextUtils.equals(intent.getAction(), AppWidgetManager.ACTION_APPWIDGET_UPDATE)) {
            int[] appWidgetIds = intent.getIntArrayExtra(AppWidgetManager.EXTRA_APPWIDGET_IDS);
            if (appWidgetIds != null) {
                WidgetHelper widgetHelper = new WidgetHelper(context);
                for (int appWidgetId : appWidgetIds) {
                    widgetHelper.configure(appWidgetId);
                }
            }
        } else {
            super.onReceive(context, intent);
        }
    }
