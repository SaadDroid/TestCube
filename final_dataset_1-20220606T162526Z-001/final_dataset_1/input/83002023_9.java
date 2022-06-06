@SuppressWarnings("WeakerAccess")
    public void browserSwitch(int requestCode, String url) {
        BrowserSwitchOptions browserSwitchOptions = new BrowserSwitchOptions()
                .requestCode(requestCode)
                .url(Uri.parse(url));
        browserSwitchClient.start(browserSwitchOptions, this);
    }
