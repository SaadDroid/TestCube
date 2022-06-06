@Override
    public boolean authorize(Activity activity) {
        activity.startActivityForResult(newIntent(activity), requestCode);
        return true;
    }
