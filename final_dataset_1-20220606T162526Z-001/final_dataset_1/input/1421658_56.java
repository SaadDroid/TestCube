public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		Assert.isInstanceOf(SocialAuthenticationToken.class, authentication, "unsupported authentication type");
		Assert.isTrue(!authentication.isAuthenticated(), "already authenticated");
		SocialAuthenticationToken authToken = (SocialAuthenticationToken) authentication;
		String providerId = authToken.getProviderId();
		Connection<?> connection = authToken.getConnection();

		String userId = toUserId(connection);
		if (userId == null) {
			throw new BadCredentialsException("Unknown access token");
		}

		UserDetails userDetails = userDetailsService.loadUserByUserId(userId);
		if (userDetails == null) {
			throw new UsernameNotFoundException("Unknown connected account id");
		}

		return new SocialAuthenticationToken(connection, userDetails, authToken.getProviderAccountData(), getAuthorities(providerId, userDetails));
	}
