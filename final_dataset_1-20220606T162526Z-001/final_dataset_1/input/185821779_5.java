@Override
  public OAuthUser take() {

    var user = userSessionRepository.take().getUser();
    if (user instanceof OAuthUser) {
      return (OAuthUser) user;
    }

    throw new NoUserFoundException("No OAuth users found in the repository.");
  }
