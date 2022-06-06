@Override
	public Set<Authority> createAuthorities(Role[] roles) {
		Set<Authority> authorities = Sets.newHashSet();
		Arrays.asList(roles).forEach(r -> authorities.add(new Authority(r.name())));
		return authorities;
	}
