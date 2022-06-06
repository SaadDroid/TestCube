@Override
	public SessionInformation getSessionInformation(String sessionId) {
		S session = this.sessionRepository.findById(sessionId);
		if (session != null) {
			return new SpringSessionBackedSessionInformation<>(session, this.sessionRepository);
		}
		return null;
	}
