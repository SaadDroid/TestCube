@AroundInvoke
	protected Object roleCall(InvocationContext context) throws Exception {
		HasPermission permissionMethodAnnotation = context.getMethod().getAnnotation(HasPermission.class);
		List<Permission> permissions = getRequiredPermission(context, permissionMethodAnnotation);
		List<Action> actions = getRequiredAction(context, permissionMethodAnnotation);
		boolean resourceSpecific = hasResourceSpecific(context, permissionMethodAnnotation);
		ResourceGroupEntity resourceGroup = null;

		if (resourceSpecific && context.getParameters().length > 0) {
			for (Object o : context.getParameters()) {
				if (o instanceof ResourceEntity) {
					ResourceEntity resource = (ResourceEntity) o;
					resourceGroup = resource.getResourceGroup();
					break;
				}
			}
		}
		for (Permission permission : permissions) {
			if (actions.isEmpty()) {
				if (permissionService.hasPermission(permission, null, null, resourceGroup, null)) {
					return context.proceed();
				}
			} else {
				for (Action action : actions) {
					if (permissionService.hasPermission(permission, null, action, resourceGroup, null)) {
						return context.proceed();
					}
				}
			}
		}

		permissionService.throwNotAuthorizedException(null);
		return null;
	}
