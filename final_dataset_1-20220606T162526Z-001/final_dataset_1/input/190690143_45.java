public <T> T assumeUiApi(String apiId, Class<T> api) {
		InvocationHandler handler = (self, method, args) -> {
			nativeBrowser.executeJavaScript("window.uiApi."+apiId+"."+method.getName()+"("+collectArgs(args)+");", "", 0);
			return null;
		};
		return (T) Proxy.newProxyInstance(api.getClassLoader(), new Class[] {api}, handler);
	}
