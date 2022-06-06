@Override
	public Authentication signInUser(User user) {
	    Authentication authentication = new UsernamePasswordAuthenticationToken(user, user.getPassword(), user.getAuthorities());
	    SecurityContextHolder.getContext().setAuthentication(authentication);
	    return authentication;
	}
