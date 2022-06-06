public boolean hasAnyProjectPermission(Authentication authentication, Permission permission) {
		for (GrantedAuthority authority : authentication.getAuthorities()) {
			if (authority instanceof PermissionGrantedAuthority) {
				PermissionGrantedAuthority pga = (PermissionGrantedAuthority) authority;
				GrantedAuthorityTarget target = pga.getTarget();
				Type type = target.getType();
				if ((type == Type.PROJECT) &&
					hasPermission(pga, permission)) {

					return true;
				}
			}
		}
		return hasApplicationPermission(authentication, permission);
	}
