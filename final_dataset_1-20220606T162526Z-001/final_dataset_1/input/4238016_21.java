@Override
	public int compare(RoleGrantedAuthority rga1, RoleGrantedAuthority rga2) {
		GrantedAuthorityTarget target1 = rga1.getTarget();
		GrantedAuthorityTarget target2 = rga2.getTarget();
		Type type1 = target1.getType();
		Type type2 = target2.getType();
		int result = ((Integer) type1.ordinal()).compareTo(type2.ordinal());
		if (result != 0) {
			return result;
		}

		String targetId1 = target1.getTargetId();
		String targetId2 = target2.getTargetId();
		result = targetId1.compareToIgnoreCase(targetId2);
		if (result != 0) {
			return result;
		}

		return rga1.getRoleName().compareToIgnoreCase(rga2.getRoleName());
	}
