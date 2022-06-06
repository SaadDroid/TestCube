@RequestMapping("/login")
	public ModelAndView login(HttpServletRequest request,
			HttpServletResponse response) {
		
		ModelAndView mv = new ModelAndView();
        mv.setViewName("login");
		LOGGER.debug("enter login action");
		//解析用户凭据。
        KnightCredential credential = credentialResolver.resolveCredential(request);
		//没有提供任何认证凭据。
		if(credential==null){
			//设置serivce地址到session中。
			String service = request.getParameter(WebConstants.SERVICE_PARAM_NAME);
			LOGGER.debug("the servcie is "+service);
			if(!StringUtils.isEmpty(service)){
				request.getSession().setAttribute(WebConstants.KI4SO_SERVICE_KEY_IN_SESSION, service);
			}
			LOGGER.info("no credential, return login page");
			//返回到登录页面，索取用户凭据。
			return mv;
		}
		//提供了用户凭据
		else{
			//调用核心结果进行凭据认证。
			LoginResult result = ki4soService.login(credential);
			//将验证结果转换为视图输出结果。
			mv = loginResultToView.loginResultToView(mv, result, request, response);
		}
		return mv;
	}
