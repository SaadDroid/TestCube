@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		HttpServletResponse resp = (HttpServletResponse) response;
		TrimResponseWrapper trimResponse = new TrimResponseWrapper(resp);
		chain.doFilter(request, trimResponse);

		Boolean trimmable = trimResponse.isTrimmable();
		if ((trimmable != null) && trimmable.booleanValue()) {
			byte[] data = getTrimmedData(trimResponse);
			response.setContentLength(data.length);
			response.getOutputStream().write(data);
		}
	}
