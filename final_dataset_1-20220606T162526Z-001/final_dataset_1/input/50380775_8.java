@SuppressLint("JavascriptInterface")
    public void addJavascriptInterface(Object object, String name) {
        if (TextUtils.equals(name, JAVASCRIPT_INTERFACE_NAME)) {
            throw new IllegalArgumentException(JAVASCRIPT_INTERFACE_NAME + " is a reserved Javascript Interface name.");
        }

        if (javascriptInterfaces.get(name) == null) {
            javascriptInterfaces.put(name, object);
            webView.addJavascriptInterface(object, name);

            TurbolinksLog.d("Adding JavascriptInterface: " + name + " for " + object.getClass().toString());
        }
    }
