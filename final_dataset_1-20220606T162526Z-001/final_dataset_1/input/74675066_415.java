@Override
    public Maybe<User> loadUserByUsername(Authentication authentication) {
        return userDetailsService.loadUserByUsername((String) authentication.getPrincipal())
                .map(user -> {
                    String presentedPassword = authentication.getCredentials().toString();
                    if (!passwordEncoder.matches(presentedPassword, user.getPassword())) {
                        LOGGER.debug("Authentication failed: password does not match stored value");
                        throw new BadCredentialsException("Bad credentials");
                    }
                    return createUser(user);
                });
    }
