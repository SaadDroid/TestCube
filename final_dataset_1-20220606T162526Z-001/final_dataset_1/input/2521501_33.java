public RegistrationEntry register(final Window window) {
		this.window.add(window);
		requestRepaint();

		return new RegistrationEntry() {
			@Override
			public void unregister() {
				MasterContainer.this.window.remove(window);
				requestRepaint();
			}

			@Override
			public boolean isRegistered() {
				return MasterContainer.this.window.contains(window);
			}
		};
	}
